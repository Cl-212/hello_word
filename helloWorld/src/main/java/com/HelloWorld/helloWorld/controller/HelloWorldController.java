package com.HelloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String HelloWorld() {
		return"Hello World!!!";
	}
	
	@GetMapping("bsm")
	public String listaBsm() {
		return"Habilidades Comportamentais e Mentalidades"
			+ "\nMentalidade de Crescimento"
			+ "\nPersistência"
			+ "\nResponsabilidade Pessoal"
			+ "\nOrientação ao Futuro"
			+ "\nComunicação"
			+ "\nOrientação ao Detalhe"
			+ "\nProatividade"
			+ "\nTrabalho em Equipe";
	}
	
	@GetMapping("objetivos")
	public String listaObjetivos() {
		return"LISTA OBJETIVOS DE APRENDIZADO:"
			+ "\nSpring Boot e suas aplicações"
			+ "\nTrabalhar o projeto integrador"
			+ "\nMelhorar as SoftSkills no geral";
	}

}
