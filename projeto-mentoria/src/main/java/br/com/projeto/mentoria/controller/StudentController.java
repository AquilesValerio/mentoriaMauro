package br.com.projeto.mentoria.controller;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.services.StudentService;
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
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getAll() {
		List<Student> studentList;
		studentList = studentService.getAll();
		return studentList;
	}

	@GetMapping("{id}")
	public Student getById(@PathVariable(name = "id") int id) {
		System.out.println("passando por aqui*******************");
		return studentService.getById(id);
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
