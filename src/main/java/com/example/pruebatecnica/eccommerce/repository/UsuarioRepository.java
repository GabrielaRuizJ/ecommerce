package com.example.pruebatecnica.eccommerce.repository;

import com.example.pruebatecnica.eccommerce.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Optional<Usuario> findByUsuario(String usuario);
    Optional<Usuario> findById(Long id);
}
