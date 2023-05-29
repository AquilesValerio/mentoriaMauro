package br.com.projeto.mentoria.domain;

import br.com.projeto.mentoria.domain.validator.StudentValidator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "Student")
@Table(name = "Student")
public class Student extends Person {

	@Column(name = "birthdayDate", nullable = false)
	private LocalDate birthdayDate;

	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	@Override
	public List<String> validated(Person person) {
		return null;
	}
}
