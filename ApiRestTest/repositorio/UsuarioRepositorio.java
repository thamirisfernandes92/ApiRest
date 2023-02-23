package com.thamiris.ApiRestTest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thamiris.ApiRestTest.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	Usuario findById(long id);
	Usuario findByPeriodo(long duracao);
}
