package br.com.projeto.mentoria.domain.validator;

import br.com.projeto.mentoria.domain.Teacher;
import java.util.List;

public class TeacherValidator extends PersonValidator {

	public List<String> validate(Teacher teacher) {

		List<String> erros = super.validate(teacher);

		if (teacher.getAge() < 18) {
			erros.add("Teacher has to be more than 18.");
		}
		return erros;
	}
}
