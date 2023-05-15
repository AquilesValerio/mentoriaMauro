package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.repositories.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Student getById(int id) {
		var result = studentRepository.findById(id).get();
		return result;
	}

	public Student insert(Student object) {
		return studentRepository.save(object);
	}

	public void update(Student object, int id) {
		object.setId(id);
		studentRepository.save(object);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}
