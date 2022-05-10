package com.anurag.servlets;

public class UserValidateService {
    public boolean validateUser(String username, String password){
        if(username == "virat" && password == "virat123"){
            return true;
        }
        return false;
    }
}
