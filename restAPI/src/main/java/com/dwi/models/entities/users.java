package com.dwi.models.entities;

import jakarta.persistence.Entity;

@Entity
public class users {
    private int id;
    private String namalengkap;
    private String username ;
    private String password ;
    private String status;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNamalengkap() {
        return namalengkap;
    }
    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    

    
}
