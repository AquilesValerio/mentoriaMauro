package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.services.StudentService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public ResponseEntity<List<Student>> findAll() {
		List<Student> studentList;
		studentList = studentService.findAll();
		return ResponseEntity.ok(studentList);
	}

	@GetMapping("{id}")
	public ResponseEntity<Student> findById(@PathVariable(name = "id") int id) {
		var student = studentService.findById(id);
		return null;
	}

	@PostMapping()
	public Student insert(@RequestBody Student student) {
		return studentService.insert(student);
	}

	@PutMapping("{id}")
	public void update(@RequestBody Student student, @PathVariable(name = "id") int id) {
		studentService.update(student, id);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable(name = "id") int id) {
		studentService.delete(id);
	}
}
