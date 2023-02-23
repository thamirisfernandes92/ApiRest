package com.thamiris.ApiRestTest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thamiris.ApiRestTest.entities.Usuario;
import com.thamiris.ApiRestTest.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping( value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> result = repositorio.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id){
		Usuario result = repositorio.findById(id).get();
		return result;
		}
	
	
	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario){
		Usuario result = repositorio.save(usuario);
		return result;
	}
	@DeleteMapping
	public Usuario delete( Usuario usuario){
		Usuario result = repositorio.save(usuario);
		return result;
	}
		}
