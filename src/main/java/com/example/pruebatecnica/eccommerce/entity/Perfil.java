package com.example.pruebatecnica.eccommerce.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil")
    private Integer idPerfil;

    @Column(name = "nombre_perfil")
    private String nombrePerfil;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "perfil")
    private Set<UsuarioPerfil> usuarioPerfils = new HashSet<>();

    public Perfil() {
    }

    public Perfil(Integer idPerfil, String nombrePerfil, Set<UsuarioPerfil> usuarioPerfils) {
        this.idPerfil = idPerfil;
        this.nombrePerfil = nombrePerfil;
        this.usuarioPerfils = usuarioPerfils;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public Set<UsuarioPerfil> getUsuarioPerfils() {
        return usuarioPerfils;
    }

    public void setUsuarioPerfils(Set<UsuarioPerfil> usuarioPerfils) {
        this.usuarioPerfils = usuarioPerfils;
    }
}
