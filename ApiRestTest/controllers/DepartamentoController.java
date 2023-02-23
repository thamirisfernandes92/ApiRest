package com.thamiris.ApiRestTest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thamiris.ApiRestTest.entities.Departamento;
import com.thamiris.ApiRestTest.repositorio.DepartamentoRepositorio;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.thamiris.ApiRestTest.entities.Departamento;
//import com.thamiris.ApiRestTest.entities.Usuario;
//import com.thamiris.ApiRestTest.repositorio.DepartamentoRepositorio;
//import com.thamiris.ApiRestTest.repositorio.UsuarioRepositorio;
//
@RestController
@RequestMapping( value = "/departamento")
public class DepartamentoController {
//
//	@Autowired
//	private DepartamentoRepositorio repositorio;
//	
//@GetMapping(value = "/{departamento}")
//public Departamento findById(@PathVariable Long departamento){
//	Departamento result = ((Object) repositorio.findByDepartamento(departamento)).get();
//	return result;
//	}

	@Autowired
 DepartamentoRepositorio departamentoRepositorio; 
	
	@GetMapping("/departamento/{idPessoa}")
	public  void listaDepartamento(@PathVariable(value = "idPessoa")Long IdPessoa) {
		
	}
	
}
