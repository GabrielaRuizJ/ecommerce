package com.example.pruebatecnica.eccommerce;

import com.example.pruebatecnica.eccommerce.entity.Perfil;
import com.example.pruebatecnica.eccommerce.entity.Usuario;
import com.example.pruebatecnica.eccommerce.entity.UsuarioPerfil;
import com.example.pruebatecnica.eccommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class EccommerceApplication implements CommandLineRunner {
	@Autowired
	private UsuarioService usuarioService;
	public static void main(String[] args) {
		SpringApplication.run(EccommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
