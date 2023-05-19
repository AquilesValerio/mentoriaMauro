package br.com.projeto.mentoria.domain;

import br.com.projeto.mentoria.exceptions.ApiException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import org.springframework.http.HttpStatus;

@Entity(name = "Student")
@Table(name = "Student")
public class Student extends People {

	@Column(name = "birthdayDate", nullable = false)
	private LocalDate birthdayDate;

	//To do: Melhorar o metodo da idade: Escola só aceita criancas >= 6 anos

	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	@Override
	public void validate() {
		super.validate();
		var actualDate = LocalDate.now().minusYears(6);
		if (actualDate.isBefore(birthdayDate)) {
			erros.add("The child must be more than 6 years. ");
		}
		throw new ApiException(erros, HttpStatus.BAD_REQUEST);
	}
}
