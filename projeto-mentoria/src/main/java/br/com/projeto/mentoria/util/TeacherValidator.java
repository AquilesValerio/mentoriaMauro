package br.com.projeto.mentoria.util;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.exceptions.ApiException;
import org.springframework.http.HttpStatus;

public class TeacherValidator extends PersonValidator {
	@Override
	public void validate(Teacher teacher) {
		super.validate();
		if (age < 18) {
			erros.add("Teacher has to be more than 18.");
		}
		if (!erros.isEmpty()) {
			throw new ApiException(erros, HttpStatus.BAD_REQUEST);
		}
	}
}
