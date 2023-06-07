package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.DTO.ChangeStatusTeacher;
import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.services.TeacherService;
import java.net.URI;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@GetMapping
	public ResponseEntity<List<Teacher>> findAll() {
		var teacher = teacherService.findAll();
		return ResponseEntity.ok(teacher);
	}

	@GetMapping("{id}")
	public ResponseEntity<Teacher> findById(@PathVariable(name = "id") int id) {
		var teacher = teacherService.findById(id);
		return ResponseEntity.ok(teacher);
	}

	@PostMapping()
	public ResponseEntity<Teacher> insert(@RequestBody Teacher teacher) {
		var entity = teacherService.insert(teacher);
		return ResponseEntity.created(URI.create("teachers" + entity.getId())).body(entity);
	}

	@PutMapping("{id}")
	public ResponseEntity<Void> update(@RequestBody Teacher teacher, @PathVariable(name = "id") int id) {
		teacherService.update(teacher, id);
		return ResponseEntity.noContent().build();
	}

	@PatchMapping("{id}")
	public ResponseEntity<Void> partialUpdate(@RequestBody ChangeStatusTeacher statusTeacher, @PathVariable(name = "id") int id) {
		teacherService.partialUpdate(statusTeacher, id);
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable(name = "id") int id) {
		teacherService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
