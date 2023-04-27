package br.com.projeto.mentoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "testes")
public class TestController {

	@GetMapping(path = "/")
	public String get(){
		return "Aquiles";
	}
}
