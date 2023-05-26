package br.com.projeto.mentoria.domain.validator;

import br.com.projeto.mentoria.domain.Student;
import br.com.projeto.mentoria.exceptions.ApiException;
import java.time.LocalDate;
import org.springframework.http.HttpStatus;

public class StudentValidator extends PersonValidator {
	@Override
	public void validate(Student student) {
		super.validate();
		var actualDate = LocalDate.now().minusYears(6);
		if (actualDate.isBefore(birthdayDate)) {
			erros.add("The child must be more than 6 years. ");
		}
		if(!erros.isEmpty()){
			throw new ApiException(erros, HttpStatus.BAD_REQUEST);
		}
	}
}
