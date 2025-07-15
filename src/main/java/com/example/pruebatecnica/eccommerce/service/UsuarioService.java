package com.example.pruebatecnica.eccommerce.service;

import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.entity.UsuarioPerfil;

import java.util.Set;

public interface UsuarioService {



    public Usuario save(Usuario usuario, Set<UsuarioPerfil> usuarioPerfils)throws Exception;
    public Usuario findById(Long id);
    public void deleteById(Long id);


}
