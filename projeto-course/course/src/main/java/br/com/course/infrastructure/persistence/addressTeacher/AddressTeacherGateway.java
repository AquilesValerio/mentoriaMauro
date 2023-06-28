package br.com.course.infrastructure.persistence.addressTeacher;

public class AddressTeacherGateway {
	private final AddressTeacherRepository addressTeacherRepository;

	public AddressTeacherGateway(AddressTeacherRepository addressTeacherRepository)
	{this.addressTeacherRepository = addressTeacherRepository;}

	public AddressTeacherRepository getAddressTeacherRepository() {
		return addressTeacherRepository;
	}
}
