package com.mycompany.user;

/**
 *
 * @author BlossomVixen
 */
public class User {

    private String name;
    private String email;
    private String password; //cannot be changed nor read after initializing object
    
    public User(String name, String email, String password)
    {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String getName() { return name;} 
    public String getEMail() { return email;}
    
    //avoid making a getPassword() method to later check if the password is correct  (for obvious security reasons)
    public boolean checkPassword(String str) { return str.equals(password);} 

}
