package br.com.course.infrastructure.persistence.share;

import jakarta.persistence.Column;

public abstract class PersonJPA<T extends Number> extends EntityJPA<T> {

	public PersonJPA(T id, String name, String cpf, String email) {
		super(id);
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}

	@Column(name = "name", nullable = false, length = 50)
	private String name;
	@Column(name = "CPF", nullable = false, unique = true, length = 11)
	private String cpf;
	@Column(name = "email", unique = true, columnDefinition = "VARCHAR(50) NOT NULL")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
