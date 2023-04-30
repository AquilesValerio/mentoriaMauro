package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Teacher;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class TeacherController {


	@GetMapping
	public Teacher getAll(){
		return null;
	}

	@GetMapping("{id}")
	public Teacher getById(@PathVariable(name = "id") int id){
		return null;
	}

	@PostMapping()
	public Teacher insert(@RequestBody Teacher teacher){
		return null;
	}

	@PutMapping("{id}")
	public Teacher update(@RequestBody Teacher teacher, @PathVariable(name = "id") int id){
		return null;
	}

	@DeleteMapping("{id}")
	public Teacher delete(@PathVariable(name = "id") int id){
		return null;
	}
}
