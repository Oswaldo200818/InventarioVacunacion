package oquinteros.dato;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import oquinteros.entidad.Empleado;

@Stateless
public class EmpleadoServiceImpl implements EmpleadoDao{
    @PersistenceContext(unitName = "inventarioPU")
    EntityManager em;
    
    @Override
    public List<Empleado> findAllEmployee() {
        return em.createNamedQuery("Empleado.findAll").getResultList();
    }

    @Override
    public Empleado listUserById(Empleado empleado) {
        return em.find(Empleado.class, empleado.getIdEmpleado());
    }

    @Override
    public void insertUser(Empleado empleado) {
        em.persist(empleado);
    }

    @Override
    public void updateUser(Empleado empleado) {
        em.merge(empleado);
    }
    
    @Override
    public void deleteUser(Empleado empleado) {
        em.remove(em.merge(empleado));
    }

    
    
}
