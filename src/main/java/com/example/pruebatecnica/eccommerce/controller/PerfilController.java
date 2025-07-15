package com.example.pruebatecnica.eccommerce.controller;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import com.example.pruebatecnica.eccommerce.service.PerfilService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {
    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @PostMapping
    public Perfil save(@RequestBody Perfil perfil){
        return perfilService.save(perfil);
    }
}
