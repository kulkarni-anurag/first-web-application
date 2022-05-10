package com.anurag.servlets;

public class UserValidateService {
    public boolean validateUser(String username, String password){
        if(username.equals("virat") && password.equals("virat123")){
            return true;
        }
        return false;
    }
}
