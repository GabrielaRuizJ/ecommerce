package com.example.pruebatecnica.eccommerce.controller;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import com.example.pruebatecnica.eccommerce.service.PerfilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/perfil")
public class PerfilController {
    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @PostMapping()
    public Perfil save(@RequestBody Perfil perfil){
        return perfilService.save(perfil);
    }

    @GetMapping
    public List<Perfil> findAll(){
        return perfilService.findAll();
    }

    @GetMapping("/{id}")
    public Perfil findById(@PathVariable Integer id){
        return perfilService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        perfilService.deleteById(id);
    }

    @PutMapping
    public Perfil updatePerfil(@RequestBody Perfil perfil){
        Perfil perfilDb = perfilService.findById(perfil.getId());
        perfilDb.setNombre_perfil(perfil.getNombre_perfil());
        perfilDb.setAdmin_view(perfil.getAdmin_view());
        return perfilService.update(perfilDb);
    }

}
