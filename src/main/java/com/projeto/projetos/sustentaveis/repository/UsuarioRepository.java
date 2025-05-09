package com.projeto.projetos.sustentaveis.repository;

import com.projeto.projetos.sustentaveis.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
