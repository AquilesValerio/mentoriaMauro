package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.repositories.TeacherRepository;
import br.com.projeto.mentoria.exceptions.ApiException;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

	private final TeacherRepository teacherRepository;

	public TeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	public List<Teacher> findAll() {
		return teacherRepository.findAll();
	}

	public Teacher findById(int id) {
		var result = teacherRepository.findById(id);
		return result.orElseThrow(() -> new ApiException("Entity not found.", HttpStatus.NOT_FOUND));
	}

	public Teacher insert(Teacher object) {
		var teacher = teacherRepository.findByCpf(object.getCpf());

		if (teacher == null) {
			return teacherRepository.save(object);
		} else if (teacher.getStatus()) {
			throw new ApiException("This teacher is already exists and your status is active.",
				HttpStatus.CONFLICT);
		} else {
			throw new ApiException("This teacher is already exists and your status is desactive.",
				HttpStatus.BAD_REQUEST);
		}
	}

	public void update(Teacher object, int id) {
		object.setId(id);
		teacherRepository.save(object);
	}

	public void delete(int id) {
		teacherRepository.deleteById(id);
	}
}
