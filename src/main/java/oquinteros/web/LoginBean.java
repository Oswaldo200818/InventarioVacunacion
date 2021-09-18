package oquinteros.web;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import oquinteros.entidad.Users;
import oquinteros.service.LoginService;



@Named("loginBean")
@RequestScoped
public class LoginBean {
    
    @Inject
    private LoginService loginService;
    private Users user;
    private String usuario;
    private String password;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validarAdmin(){
        user = loginService.encontrarVendedorPorId(usuario);
        if (user!=null) {
            if (user.getPassword().equals(this.password)) {
               return "sistemaVacunacion" + "?faces-redirect=true"; 
            }
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Usuario y/o password Incorrecto", ""));
        return null;
    }
    
    public String validarEmp(){
        user = loginService.encontrarVendedorPorId(usuario);
        if (user!=null) {
            if (user.getPassword().equals(this.password)) {
               return "viewEmpleado" + "?faces-redirect=true"; 
            }
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Usuario y/o password Incorrecto", ""));
        return null;
    }
}
