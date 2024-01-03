package org.example.dao;//public class org.example.dao.LoginBean {
//}

import java.io.Serial;
import java.io.Serializable;

public class LoginBean implements Serializable{

    @Serial
    private static final long serialVersionUID = 1;
    private String username;
    private String password;


    public void setUsername (String username){
        this.username = username;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public String getUsername (){
        return username;
    }

    public String getPassword (){
        return password;

    }



}