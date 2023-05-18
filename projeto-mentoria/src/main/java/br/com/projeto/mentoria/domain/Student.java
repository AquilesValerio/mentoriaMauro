package br.com.projeto.mentoria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

@Entity(name = "Student")
@Table(name = "Student")
public class Student extends People {

	@Column(name = "birthdayDate", nullable = false)
	private LocalDate birthdayDate;

//To do: Melhorar o metodo da idade: Escola só aceita criancas >= 6 anos


	public Date getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	public boolean isSixYearsOrMore() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime((java.util.Date) this.getBirthdayDate());
		calendar.add(Calendar.YEAR, 6);
		Date sixYearsLater = new Date(calendar.getTimeInMillis());
		LocalDate now = LocalDate.now();
		Instant instant = this.getBirthdayDate().toInstant();
		LocalDate birthday = instant.atZone(ZoneId.systemDefault()).toLocalDate();
	//	return now.isAfter(birthday.plusYears(6)) || now.isEqual(birthday.plusYears(6));
	}

}
