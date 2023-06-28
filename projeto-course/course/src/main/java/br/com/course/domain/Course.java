package br.com.course.domain;

import br.com.course.domain._share.entities.Entity;


public class Course extends Entity<Integer> {

	private String name;
	private double price;
	private double voucher;

	public Course(Integer id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getVoucher() {
		return voucher;
	}
}
