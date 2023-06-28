package br.com.course.infrastructure.persistence.holiday;

public class HolidayGateway {
	private final HolidayRepository holidayRepository;

	public HolidayGateway(HolidayRepository holidayRepository) {this.holidayRepository = holidayRepository;}

	public HolidayRepository getHolidayRepository() {
		return holidayRepository;
	}
}
