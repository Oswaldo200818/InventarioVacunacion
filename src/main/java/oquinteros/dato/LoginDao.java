package oquinteros.dato;


import oquinteros.entidad.Users;

public interface LoginDao {
    
   public Users findUserLogin(String aliasUser);
    
   
}
