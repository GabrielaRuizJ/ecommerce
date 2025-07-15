package com.example.pruebatecnica.eccommerce.repository;

import com.example.pruebatecnica.eccommerce.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
