package com.projeto.projetos.sustentaveis.service;

import com.projeto.projetos.sustentaveis.model.Usuario;
import com.projeto.projetos.sustentaveis.model.Usuario.Perfil;
import com.projeto.projetos.sustentaveis.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @PostConstruct
    public void criarUsuarioAdmin() {
        if (repository.findByUsername("admin").isEmpty()) {
            Usuario admin = new Usuario();
            admin.setNome("Administrador");
            admin.setUsername("admin");
            admin.setSenha(encoder.encode("123456"));
            admin.setPerfil(Perfil.ADMIN);
            repository.save(admin);
        }
    }
}
