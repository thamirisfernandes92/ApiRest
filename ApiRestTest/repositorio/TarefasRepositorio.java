package com.thamiris.ApiRestTest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thamiris.ApiRestTest.entities.Tarefas;


public interface TarefasRepositorio extends JpaRepository<Tarefas, String>{


}
