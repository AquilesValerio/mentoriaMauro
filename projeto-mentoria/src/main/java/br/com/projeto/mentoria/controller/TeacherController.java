package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.services.TeacherService;
import java.util.List;
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
	public List<Teacher> getAll(){
		return new TeacherService().getAll();
	}

	@GetMapping("{id}")
	public Teacher getById(@PathVariable(name = "id") int id){
		return new TeacherService().getById(id);
	}

	@PostMapping()
	public Teacher insert(@RequestBody Teacher teacher){
		return new TeacherService().insert(teacher);
	}

	@PutMapping("{id}")
	public void update(@RequestBody Teacher teacher, @PathVariable(name = "id") int id){
		 new TeacherService().update(teacher, id);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable(name = "id") int id){
		  new TeacherService().delete(id);
	}
}
