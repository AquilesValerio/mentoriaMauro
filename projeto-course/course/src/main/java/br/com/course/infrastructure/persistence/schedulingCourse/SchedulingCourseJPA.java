package br.com.course.infrastructure.persistence.schedulingCourse;

import br.com.course.domain.Student;
import br.com.course.domain.Teacher;
import br.com.course.domain._share.entities.Entity;
import jakarta.persistence.Column;
import java.util.Date;

public class SchedulingCourseJPA<T extends Number> extends Entity<T> {

	public SchedulingCourseJPA(T id, Date date, double value, int teacherId, int studentId) {
		super(id);
		this.date = date;
		this.value = value;
		this.teacherId = teacherId;
		this.studentId = studentId;
	}
	@Column(name = "date", nullable = false)
	private Date date;
	@Column(name = "value", nullable = false)
	private double value;
	private int teacherId;
	private int studentId;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
