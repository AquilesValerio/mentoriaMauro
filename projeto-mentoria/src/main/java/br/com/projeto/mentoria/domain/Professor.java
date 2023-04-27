package br.com.projeto.mentoria.domain;

import java.util.Objects;

public class Professor {

	private int id;
	private String name;
	private String cpf;

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String setName(String newName){
		return this.name = name;
	}

	public String getCpf(){
		return cpf;
	}

	public String setCpf(String newCpf){
		return this.cpf = newCpf;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Professor professor)) {
			return false;
		}
		return getId() == professor.getId() && Objects.equals(getName(), professor.getName()) && Objects.equals(getCpf(), professor.getCpf());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getCpf());
	}
}
