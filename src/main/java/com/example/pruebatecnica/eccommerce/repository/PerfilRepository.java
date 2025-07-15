package com.example.pruebatecnica.eccommerce.repository;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository <Perfil, Integer> {
}
