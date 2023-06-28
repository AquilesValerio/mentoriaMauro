package br.com.course.infrastructure.persistence.addressTeacher;

import br.com.course.domain.Teacher;
import br.com.course.domain._share.entities.Entity;
import jakarta.persistence.Column;

public class AddressTeacherJPA<T extends Number> extends Entity<T> {

	public AddressTeacherJPA(T id, String addressCep, String addressRoad, String addressNeighborhood,
		String addressNumber, String addressCity, String addressState, int typeAddress, Teacher teacherId) {
		super(id);
		this.addressCep = addressCep;
		this.addressRoad = addressRoad;
		this.addressNeighborhood = addressNeighborhood;
		this.addressNumber = addressNumber;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.typeAddress = typeAddress;
		this.teacherId = teacherId;
	}
	@Column(name = "addressCep", nullable = false, length = 50)
	private String addressCep;

	@Column(name = "addressRoad", nullable = false, length = 50)
	private String addressRoad;

	@Column(name = "addressNeighborhood", nullable = false, length = 50)
	private String addressNeighborhood;

	@Column(name = "addressNumber", nullable = false, length = 50)
	private String addressNumber;

	@Column(name = "addressCity", nullable = false, length = 50)
	private String addressCity;

	@Column(name = "addressState", nullable = false, length = 50)
	private String addressState;

	@Column(name = "typeAddress", nullable = false, length = 4)
	private int typeAddress;

	@Column(name = "addressCep", nullable = false)
	private Teacher teacherId;

	public String getAddressCep() {
		return addressCep;
	}

	public void setAddressCep(String addressCep) {
		this.addressCep = addressCep;
	}

	public String getAddressRoad() {
		return addressRoad;
	}

	public void setAddressRoad(String addressRoad) {
		this.addressRoad = addressRoad;
	}

	public String getAddressNeighborhood() {
		return addressNeighborhood;
	}

	public void setAddressNeighborhood(String addressNeighborhood) {
		this.addressNeighborhood = addressNeighborhood;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public int getTypeAddress() {
		return typeAddress;
	}

	public void setTypeAddress(int typeAddress) {
		this.typeAddress = typeAddress;
	}

	public Teacher getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Teacher teacherId) {
		this.teacherId = teacherId;
	}
}
