package com.example.pruebatecnica.eccommerce.service;

import com.example.pruebatecnica.eccommerce.entity.Perfil;

import java.util.List;

public interface PerfilService {
    Perfil save(Perfil perfil);
    List<Perfil> findAll();
    Perfil findById(Integer id);
    void deleteById(Integer id);
    Perfil update(Perfil perfil);
}
