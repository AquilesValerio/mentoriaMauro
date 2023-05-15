package br.com.projeto.mentoria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity(name = "Student")
@Table(name = "Student")
public class Student extends People {

	@Column(name = "birthdayDate", nullable = false)
	private Date birthdayDate;

//To do: Calcula a idade da pessoa: Escola só aceita criancas >= 6 anos

	public Date getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}



}
