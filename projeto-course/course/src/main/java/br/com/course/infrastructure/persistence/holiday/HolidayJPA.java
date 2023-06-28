package br.com.course.infrastructure.persistence.holiday;

import br.com.course.domain._share.entities.Entity;
import jakarta.persistence.Column;

public class HolidayJPA<T extends Number> extends Entity<T> {

	public HolidayJPA(T id, int day, int month, String addressCep) {
		super(id);
		this.day = day;
		this.month = month;
		this.addressCep = addressCep;
	}
	@Column(name = "day", nullable = false, length = 2)
	private int day;
	@Column(name = "month", nullable = false, length = 2)
	private int month;
	@Column(name = "addressCep", nullable = false, length = 80)
	private String addressCep;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getAddressCep() {
		return addressCep;
	}

	public void setAddressCep(String addressCep) {
		this.addressCep = addressCep;
	}
}
