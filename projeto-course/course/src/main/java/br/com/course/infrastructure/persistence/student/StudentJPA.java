package br.com.course.infrastructure.persistence.student;

import br.com.course.infrastructure.persistence.share.PersonJPA;

public class StudentJPA extends PersonJPA<Integer> {

	public StudentJPA(Integer id, String name, String cpf, String email) {
		super(id, name, cpf, email);
	}


}
