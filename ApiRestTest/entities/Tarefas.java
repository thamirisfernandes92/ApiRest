package com.thamiris.ApiRestTest.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long idTarefa;
	private String titutlo;
	private String descricao;
	private String data;
	private Long duracao;
	private boolean finalizado;
	private Long idPessoa;
	private String departamneto;
	


}
