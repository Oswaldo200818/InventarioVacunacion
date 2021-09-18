package oquinteros.service;

import java.util.List;
import javax.ejb.Local;
import oquinteros.entidad.Empleado;

@Local
public interface EmpleadoService {
    
    public List<Empleado> encontrarEmpleado();
    
    public Empleado listarUsuarioPorId(Empleado empleado);
    
    public void insertarUsuario(Empleado empleado);
    
    public void actualizarUsuario(Empleado empleado);
    
    public void eliminarUsuario(Empleado empleado);
}
