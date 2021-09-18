package oquinteros.dato;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import oquinteros.entidad.Users;

@Stateless
public class LoginDaoImpl implements LoginDao {

    @PersistenceContext(unitName = "inventarioPU")
    EntityManager em;

    @Override
    public Users findUserLogin(String aliasUser) {
        Query q = em.createNamedQuery("Users.findByUsername", Users.class).setParameter("username", aliasUser);
        List<Users> listLogin = q.getResultList();
        
        if (!listLogin.isEmpty()) {
            return listLogin.get(0);
        }
        return null;
    }

    

 

}
