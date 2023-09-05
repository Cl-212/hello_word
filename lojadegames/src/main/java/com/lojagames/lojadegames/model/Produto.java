package com.lojagames.lojadegames.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nomeProduto é Obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo deve conter no minimo 5 e no maximo 100 caracteres")
	private String nomeProduto;
	
	@NotBlank(message = "O atributo descricaoProduto é Obrigatorio!")
	@Size(min = 10, max = 1000, message = "O atributo deve conter no minimo 10 e no maximo 1000 caracteres")
	private String descricaoProduto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}
	
	
	

}
