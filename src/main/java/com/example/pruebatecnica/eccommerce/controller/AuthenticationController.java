package com.example.pruebatecnica.eccommerce.controller;

import com.example.pruebatecnica.eccommerce.config.JwtUtils;
import com.example.pruebatecnica.eccommerce.entity.JwtRequest;
import com.example.pruebatecnica.eccommerce.entity.JwtResponse;
import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.exception.UsuarioNotFoundException;
import com.example.pruebatecnica.eccommerce.service.impl.UsuarioDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UsuarioDetailsServiceImpl usuarioDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/generatetoken")
    public ResponseEntity<?>generarToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            autenticar(jwtRequest.getUsuario(),jwtRequest.getClave());
        } catch (UsuarioNotFoundException exception) {
            exception.printStackTrace();
            throw new Exception("Usuario no encontrado");
        }
        UserDetails userDetails = this.usuarioDetailsService.loadUserByUsername(jwtRequest.getUsuario());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void autenticar(String usuario, String clave)throws Exception{
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usuario,clave));
        }catch (DisabledException disabledException){
            throw new Exception("Uusario deshabilitado "+disabledException.getMessage());
        } catch (BadCredentialsException badCredentialsException) {
            throw new Exception("Credenciales invalidas "+badCredentialsException.getMessage());
        }
    }

    @GetMapping("/actualusuario")
    public Usuario obtenerUsuarioActual(Principal principal){
        return (Usuario) this.usuarioDetailsService.loadUserByUsername(principal.getName());
    }

}
