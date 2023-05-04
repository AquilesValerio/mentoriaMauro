package br.com.projeto.mentoria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;


@Entity(name = "db_teachers")
@Table(name = "db_teachers")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "CPF")
	private String cpf;

	public int getId(){
		return id;
	}

	public int setId(int newId){
		return this.id = newId;
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
		if (!(o instanceof Teacher professor)) {
			return false;
		}
		return getId() == professor.getId() && Objects.equals(getName(), professor.getName()) && Objects.equals(getCpf(), professor.getCpf());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getCpf());
	}

	@Override
	public String toString() {
		return "Teacher{" +
			"name='" + name + '\'' +
			'}';
	}
}
