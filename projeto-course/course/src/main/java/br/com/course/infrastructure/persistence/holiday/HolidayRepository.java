package br.com.course.infrastructure.persistence.holiday;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository  extends JpaRepository<HolidayJPA, Integer> {
}
