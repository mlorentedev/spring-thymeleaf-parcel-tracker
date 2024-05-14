package com.dam.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;
import lombok.Data;


@MappedSuperclass
@Data
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    private Roles rol;

    @OneToOne(cascade = CascadeType.ALL) 
    private AddressInfo userInfo;

    public User(String username, String password, Roles rol, AddressInfo userInfo) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.userInfo = userInfo;
    }
    
}
