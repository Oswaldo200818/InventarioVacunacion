package oquinteros.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import oquinteros.entidad.Users;
import oquinteros.dato.LoginDao;

@Stateless
public class LoginServiceImpl implements LoginService{

    EntityManager em;
    
    @Inject
    private LoginDao loginDao;

    @Override
    public Users encontrarVendedorPorId(String aliasUser) {
        return loginDao.findUserLogin(aliasUser);
        }

    

   
 
}
