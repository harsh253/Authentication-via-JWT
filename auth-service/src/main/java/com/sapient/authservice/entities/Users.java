package com.sapient.authservice.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Users")
public class Users {

    @Autowired
    private BCryptPasswordEncoder encoder;
//    @Id
//    private String id;
    private String username, password;
    private String role;

    public Users() {
    }

    public Users( String username, String password, String role) {
//        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
