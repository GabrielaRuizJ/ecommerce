package com.example.pruebatecnica.eccommerce.service;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import com.example.pruebatecnica.eccommerce.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServiceImpl implements PerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilServiceImpl(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    @Override
    public Perfil save(Perfil perfil) {
        return perfilRepository.save(perfil);
    }

    @Override
    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil findById(Integer id) {
        return perfilRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        perfilRepository.deleteById(id);
    }

    @Override
    public Perfil update(Perfil perfil) {
        return null;
    }
}
