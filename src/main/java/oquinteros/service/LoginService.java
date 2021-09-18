package oquinteros.service;

import javax.ejb.Local;
import oquinteros.entidad.Users;

@Local
public interface LoginService {

      public Users encontrarVendedorPorId(String aliasUser);

   
}
