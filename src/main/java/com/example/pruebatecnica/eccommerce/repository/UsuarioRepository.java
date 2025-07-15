package com.example.pruebatecnica.eccommerce.repository;

import com.example.pruebatecnica.eccommerce.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Integer> {

}
