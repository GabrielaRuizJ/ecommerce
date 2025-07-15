package com.example.pruebatecnica.eccommerce.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario_perfil")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class UsuarioPerfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UsuarioPerfil;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    private Perfil perfil;

    public UsuarioPerfil() {
    }

    public UsuarioPerfil(Long usuarioPerfil, Usuario usuario, Perfil perfil) {
        UsuarioPerfil = usuarioPerfil;
        this.usuario = usuario;
        this.perfil = perfil;
    }

    public Long getUsuarioPerfil() {
        return UsuarioPerfil;
    }

    public void setUsuarioPerfil(Long usuarioPerfil) {
        UsuarioPerfil = usuarioPerfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
