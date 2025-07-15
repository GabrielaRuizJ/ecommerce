package com.example.pruebatecnica.eccommerce.controller;

import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
}
