package oquinteros.dato;

import java.util.List;
import oquinteros.entidad.Empleado;
public interface EmpleadoDao {
    
    public List<Empleado> findAllEmployee();
    
    public Empleado listUserById(Empleado empleado);
    
    public void insertUser(Empleado empleado);
    
    public void updateUser(Empleado empleado);
    
    public void deleteUser(Empleado empleado);
}
