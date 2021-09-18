package oquinteros.web;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import oquinteros.entidad.Empleado;
import oquinteros.service.EmpleadoService;
import org.primefaces.event.RowEditEvent;

@Named("empleadoBean")
@RequestScoped
public class EmpleadoBean {
    @Inject
    private EmpleadoService empleadoService;
    private Empleado empleadoSelect;
    private Empleado empleado;
    
    List<Empleado> listEmpleado;
    
    @PostConstruct
    public void inicializar(){
        listEmpleado = empleadoService.encontrarEmpleado();
        empleadoSelect = new Empleado();
        empleado = new Empleado();
    }
    
    public void editListener(RowEditEvent event){
        Empleado empleado = (Empleado) event.getObject();
        empleadoService.actualizarUsuario(empleado);
    }
    
    public List<Empleado> getListEmpleado() {
        return listEmpleado;
    }

    public void setListEmpleado(List<Empleado> listEmpleado) {
        this.listEmpleado = listEmpleado;
    }

    public Empleado getEmpleadoSelect() {
        return empleadoSelect;
    }

    public void setEmpleadoSelect(Empleado empleadoSelect) {
        this.empleadoSelect = empleadoSelect;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public void addUser(){
        this.empleadoService.insertarUsuario(empleadoSelect);
        this.listEmpleado.add(empleadoSelect);
        this.empleadoSelect = null;
    }
    public void removeUser(){
        this.empleadoService.eliminarUsuario(empleadoSelect);
        this.listEmpleado.remove(this.empleadoSelect);
        this.empleadoSelect = null;
    }
    public void restartUserSelect(){
        this.empleadoSelect = new Empleado();
    }
    
}
