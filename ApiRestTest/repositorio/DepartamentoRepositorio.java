package com.thamiris.ApiRestTest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thamiris.ApiRestTest.entities.Departamento;


public interface DepartamentoRepositorio extends JpaRepository<Departamento, String>{

	Object findByDepartamento(Long departamento);

}
