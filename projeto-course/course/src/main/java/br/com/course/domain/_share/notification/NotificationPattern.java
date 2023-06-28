package br.com.course.domain._share.notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationPattern {
	private List<String> listErros;

	private List<String> create() {
		return listErros == null ? new ArrayList<>() : listErros;
	}

	public void addErros(List<String> erros) {
		create().addAll(erros);
	}

	public void addErro(String erro) {
		create().add(erro);
	}

	public Boolean hasErros() {
		return listErros == null ? false : !listErros.isEmpty();
	}

	public List<String> getListErros() {
		return create();
	}
}
