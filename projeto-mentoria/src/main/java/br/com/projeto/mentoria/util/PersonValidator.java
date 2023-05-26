package br.com.projeto.mentoria.util;

import br.com.projeto.mentoria.domain.Person;

public final class PersonValidator extends Person {

	public void validate(Person people) {
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
