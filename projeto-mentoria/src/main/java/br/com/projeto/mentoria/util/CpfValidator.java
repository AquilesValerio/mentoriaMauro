package br.com.projeto.mentoria.util;

public final class CpfValidator {

	public static boolean isValidCPF(String cpf) {
		// remove caracteres indesejados
		cpf = cpf.replaceAll("[^0-9]", "");

		// verifica se o CPF possui 11 dígitos
		if (cpf.length() != 11)
			return false;

		// calcula o primeiro dígito verificador
		int soma = 0;
		for (int i = 0; i < 9; i++) {
			soma += (cpf.charAt(i) - '0') * (10 - i);
		}
		int digito1 = 11 - (soma % 11);
		if (digito1 > 9) digito1 = 0;

		// calcula o segundo dígito verificador
		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += (cpf.charAt(i) - '0') * (11 - i);
		}
		int digito2 = 11 - (soma % 11);
		if (digito2 > 9) digito2 = 0;

		// verifica se os dígitos calculados são iguais aos informados
		return (cpf.charAt(9) - '0' == digito1) && (cpf.charAt(10) - '0' == digito2);
	}
}
