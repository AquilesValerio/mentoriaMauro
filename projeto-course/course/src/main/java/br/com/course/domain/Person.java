package br.com.course.domain;

import br.com.course.domain._share.entities.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


public abstract class Person<T extends Number> extends Entity<T> {

	public Person(T id, String name, String cpf, String email) {
		super(id);
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}

	private String name;
	private String cpf;
	private String email;


	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}
}
