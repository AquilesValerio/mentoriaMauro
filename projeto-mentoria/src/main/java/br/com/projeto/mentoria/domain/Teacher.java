package br.com.projeto.mentoria.domain;

import br.com.projeto.mentoria.domain.DTO.TeacherDto;
import br.com.projeto.mentoria.domain.validator.TeacherValidator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;

@Entity(name = "Teacher")
@Table(name = "Teacher")
public class Teacher extends Person {

	@Column(name = "age", nullable = false)
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public List<String> validated() {
		return new TeacherValidator().validate(this);
	}

	public TeacherDto toDto(){
		 return new TeacherDto(name, cpf);
	}
}