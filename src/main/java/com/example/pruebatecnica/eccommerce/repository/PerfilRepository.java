package com.example.pruebatecnica.eccommerce.repository;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerfilRepository extends JpaRepository<Perfil,Long> {
    Optional<Perfil> findByNombrePerfil(String nombrePerfil);
}
