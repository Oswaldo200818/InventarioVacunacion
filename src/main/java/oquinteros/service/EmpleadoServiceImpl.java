package oquinteros.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import oquinteros.dato.EmpleadoDao;
import oquinteros.entidad.Empleado;

@Stateless
public class EmpleadoServiceImpl implements EmpleadoService{
    EntityManager em;
    @Inject
    private EmpleadoDao empleadoDao;
    @Override
    public List<Empleado> encontrarEmpleado() {
        return empleadoDao.findAllEmployee();
    }

    @Override
    public Empleado listarUsuarioPorId(Empleado empleado) {
        return empleadoDao.listUserById(empleado);
    }

    @Override
    public void insertarUsuario(Empleado empleado) {
        empleadoDao.insertUser(empleado);
    }

    @Override
    public void actualizarUsuario(Empleado empleado) {
        empleadoDao.updateUser(empleado);
    }

    @Override
    public void eliminarUsuario(Empleado empleado) {
        empleadoDao.deleteUser(empleado);
    }
    
}
