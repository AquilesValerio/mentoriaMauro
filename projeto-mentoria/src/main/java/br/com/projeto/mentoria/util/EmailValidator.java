package br.com.projeto.mentoria.util;

public final class EmailValidator {

	public static boolean isValidEmail(String email) {
		String regex = "^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
		return email.matches(regex);
	}
}
