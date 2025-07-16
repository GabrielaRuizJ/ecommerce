package com.example.pruebatecnica.eccommerce.service.impl;

import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.entity.UsuarioPerfil;
import com.example.pruebatecnica.eccommerce.repository.PerfilRepository;
import com.example.pruebatecnica.eccommerce.repository.UsuarioRepository;
import com.example.pruebatecnica.eccommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PerfilRepository perfilRepository;


    @Override
    public Usuario save(Usuario usuario, Set<UsuarioPerfil> usuarioPerfils) throws Exception {
        for (UsuarioPerfil up : usuarioPerfils) {
            perfilRepository.save(up.getPerfil());
        }
        usuario.getUsuarioperfils().addAll(usuarioPerfils);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Long id){
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }

    @Override
    public void deleteById(Long id) {

    }
}
