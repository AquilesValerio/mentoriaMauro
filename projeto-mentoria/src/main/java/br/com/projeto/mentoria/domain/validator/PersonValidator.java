package br.com.projeto.mentoria.domain.validator;

import br.com.projeto.mentoria.domain.Person;
import br.com.projeto.mentoria.util.CpfValidator;
import br.com.projeto.mentoria.util.EmailValidator;
import java.util.ArrayList;
import java.util.List;

public abstract class PersonValidator{

	protected List<String> validate(Person person) {

		List<String> erros = new ArrayList<>();

		if (person.getName() == null || person.getName().trim().isEmpty() || person.getName().length() > 50) {
			erros.add("This field is mandatory and must be 50 characters long.");
		}
		if (!CpfValidator.isValidCPF(person.getCpf())) {
			erros.add("Must be a valid cpf");
		}
		if (!EmailValidator.isValidEmail(person.getEmail())) {
			erros.add("Must be a valid email");
		}
		return  erros;
	}
}
