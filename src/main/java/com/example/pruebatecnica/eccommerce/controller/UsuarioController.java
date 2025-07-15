package com.example.pruebatecnica.eccommerce.controller;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping()
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Integer id){
        return usuarioService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        usuarioService.deleteById(id);
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        Usuario usuarioDb = usuarioService.findById(usuario.getId());
        usuarioDb.setNombre(usuario.getNombre());
        usuarioDb.setApellido(usuario.getApellido());
        usuarioDb.setClave(usuario.getClave());
        usuarioDb.setUsuario(usuario.getUsuario());
        usuarioDb.setEmail(usuario.getEmail());
        usuarioDb.setPerfil(usuario.getPerfil());
        return usuarioService.update(usuarioDb);
    }
}
