package br.com.course.domain;

import br.com.course.domain._share.entities.Entity;
import java.util.Date;

public class SchedulingCourse extends Entity<Integer> {

	private Date date;
	private double value;
	private Teacher teacher;
	private Student student;

	public SchedulingCourse(Integer id) {
		super(id);
	}

	public Date getDate() {
		return date;
	}

	public double getValue() {
		return value;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Student getStudent() {
		return student;
	}
}
