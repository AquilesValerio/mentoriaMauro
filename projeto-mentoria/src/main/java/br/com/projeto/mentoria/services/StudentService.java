package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.exceptions.ApiException;
import br.com.projeto.mentoria.repositories.StudentRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student findById(int id) {
		var result = studentRepository.findById(id).get();
		return result;
	}

	public Student insert(Student object) {
		object.validate();
		var student = studentRepository.findByCpf(object.getCpf());
		if (student == null) {
			return studentRepository.save(object);
		} else if (student.getStatus()) {
			throw new ApiException("This student is already exists and your status is active.",
				HttpStatus.CONFLICT);
		} else {
			throw new ApiException("This student is already exists and your status is desactive.",
				HttpStatus.BAD_REQUEST);
		}
	}

	public void update(Student object, int id) {
		object.setId(id);
		studentRepository.save(object);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}
}
