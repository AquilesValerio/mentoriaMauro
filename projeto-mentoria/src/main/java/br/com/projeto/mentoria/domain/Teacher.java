package br.com.projeto.mentoria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Teacher")
@Table(name = "Teacher")
public class Teacher extends Person {
	public String TesteDosFera;
	@Column(name = "age", nullable = false)
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}