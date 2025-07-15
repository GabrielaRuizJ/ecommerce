package com.example.pruebatecnica.eccommerce.service;

import com.example.pruebatecnica.eccommerce.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    Usuario findById(Integer id);
    void deleteById(Integer id);
    Usuario update(Usuario usuario);

}
