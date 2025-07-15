package com.example.pruebatecnica.eccommerce.controller;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.entity.UsuarioPerfil;
import com.example.pruebatecnica.eccommerce.repository.PerfilRepository;
import com.example.pruebatecnica.eccommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private PerfilRepository perfilRepository;

    @PostMapping("/")
    public Usuario save(@RequestBody Usuario usuario)throws Exception{
        Set<UsuarioPerfil> perfils = new HashSet<>();
        Perfil perfil = perfilRepository.findByNombrePerfil("CLIENTE")
                .orElseThrow(() -> new Exception("Perfil CLIENTE no encontrado"));

        UsuarioPerfil usuarioPerfil = new UsuarioPerfil();
        usuarioPerfil.setUsuario(usuario);
        usuarioPerfil.setPerfil(perfil);
        perfils.add(usuarioPerfil);
        return usuarioService.save(usuario,perfils);
    }

    @GetMapping("/{usuario}")
    public Usuario obtenerUsuario(@PathVariable("usuario") Long id){
        return usuarioService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        usuarioService.deleteById(id);
    }

}