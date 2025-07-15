package com.example.pruebatecnica.eccommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Perfil")

public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_perfil;
    private Boolean admin_view;

    public Perfil() {
    }

    public Perfil(Integer id, String nombre_perfil, Boolean admin_view) {
        this.id = id;
        this.nombre_perfil = nombre_perfil;
        this.admin_view = admin_view;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public Boolean getAdmin_view() {
        return admin_view;
    }

    public void setAdmin_view(Boolean admin_view) {
        this.admin_view = admin_view;
    }
}
