package br.com.projeto.mentoria.domain.validator;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.exceptions.ApiException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;

public class TeacherValidator extends PersonValidator {

	public List<String> validate(Teacher teacher) {

		List<String> erros = super.validate(teacher);

		if (teacher.getAge() < 18) {
			erros.add("Teacher has to be more than 18.");
		}
		//if (!erros.isEmpty()) {
		//	throw new ApiException(erros, HttpStatus.BAD_REQUEST);
		//}
		return erros;
	}
}
