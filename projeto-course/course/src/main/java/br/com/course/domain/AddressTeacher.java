package br.com.course.domain;

import br.com.course.domain._share.entities.Entity;

public class AddressTeacher extends Entity {

	public AddressTeacher(Number id, String addressCep, String address_roadroad,
		String addressNeighborhood, String addressNumber, String addressCity,
		String addressState, int typeAddress, Teacher teacher) {
		super(id);
		this.addressCep = addressCep;
		this.addressRoad = address_roadroad;
		this.addressNeighborhood = addressNeighborhood;
		this.addressNumber = addressNumber;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.typeAddress = typeAddress;
		this.teacher = teacher;
	}

	private String addressCep;
	private String addressRoad;
	private String addressNeighborhood;
	private String addressNumber;
	private String addressCity;
	private String addressState;
	private int typeAddress;
	private Teacher teacher;

	public AddressTeacher(Integer id) {
		super(id);
	}

	public String getAddressCep() {
		return addressCep;
	}

	public String getAddressRoad() {
		return addressRoad;
	}

	public String getAddressNeighborhood() {
		return addressNeighborhood;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public int getTypeAddress() {
		return typeAddress;
	}

	public Teacher getTeacher() {
		return teacher;
	}
}
