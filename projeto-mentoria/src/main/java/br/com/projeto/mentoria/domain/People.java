package br.com.projeto.mentoria.domain;

import br.com.projeto.mentoria.util.CpfValidator;
import br.com.projeto.mentoria.util.EmailValidator;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "email", unique = true, columnDefinition = "VARCHAR(50) NOT NULL")
	private String email;

	@Column(name = "status", nullable = false)
	private Boolean status;

	@Column(name = "CPF", nullable = false, unique = true, length = 11)
	private String cpf;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Transient
	protected List<String> erros = new ArrayList<>();

	protected void validate() {
		if (name == null || name.trim().isEmpty() || name.length() > 50) {
			erros.add("This field is mandatory and must be 50 characters long.");
		}
		if (!CpfValidator.isValidCPF(cpf)) {
			erros.add("Must be a valid cpf");
		}
		if (!EmailValidator.isValidEmail(email)) {
			erros.add("Must be a valid email");
		}
	}
}
