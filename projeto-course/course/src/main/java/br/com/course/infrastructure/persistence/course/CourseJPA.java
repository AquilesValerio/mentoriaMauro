package br.com.course.infrastructure.persistence.course;

import br.com.course.domain._share.entities.Entity;
import jakarta.persistence.Column;

public class CourseJPA<T extends Number> extends Entity<T> {

	public CourseJPA(T id, String name, double price, double voucher) {
		super(id);
		this.name = name;
		this.price = price;
		this.voucher = voucher;
	}

	@Column(name = "name", nullable = false, length = 50)
	private String name;
	@Column(name = "price", nullable = false)
	private double price;
	@Column(name = "voucher", nullable = false)
	private double voucher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}
}
