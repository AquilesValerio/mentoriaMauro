package br.com.course.domain;

public class Student extends Person<Integer>{

	public Student(Integer id, String name, String cpf, String email) {
		super(id, name, cpf, email);
	}
}
