package br.com.projeto.mentoria.domain.validator;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.exceptions.ApiException;
import java.time.LocalDate;
import java.util.List;
import org.springframework.http.HttpStatus;

public class StudentValidator extends PersonValidator {

	public void validate(Student student) {
		List<String> erros = super.validate(student);

		var actualDate = LocalDate.now().minusYears(6);
		if (actualDate.isBefore(student.getBirthdayDate())) {
			erros.add("The child must be more than 6 years. ");
		}
		if (!erros.isEmpty()) {
			throw new ApiException(erros, HttpStatus.BAD_REQUEST);
		}
	}
}
