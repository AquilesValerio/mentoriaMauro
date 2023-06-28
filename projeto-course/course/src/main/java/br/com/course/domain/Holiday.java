package br.com.course.domain;

import br.com.course.domain._share.entities.Entity;

public class Holiday extends Entity<Integer> {

	private int day;
	private int month;
	private String addressCep;

	public Holiday(Integer id) {
		super(id);
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public String getAddressCep() {
		return addressCep;
	}
}
