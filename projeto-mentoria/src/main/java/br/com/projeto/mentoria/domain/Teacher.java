package br.com.projeto.mentoria.domain;

import br.com.projeto.mentoria.exceptions.ApiException;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.http.HttpStatus;

@Entity(name = "Teacher")
@Table(name = "Teacher")
public class Teacher extends People {

	@Column(name = "age", nullable = false)
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public void validate(){
		super.validate();
		if(age < 18){
			erros.add("Teacher has to be more than 18.");
		}
		throw new ApiException(erros, HttpStatus.BAD_REQUEST);
	}
}