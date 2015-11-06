package com.zjj.action;

/**
 * Created by zhaojj on 15/11/3.
 */
public class login {
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String execute(){
        if(username.equals("admin")&&password.equals("123456"))
            return "success";
        return "fail";
    }


}
