package br.com.course.domain;

public class Teacher extends Person<Integer> {

	private String graduation;
	private Course course;

	public Teacher(Integer id, String name, String cpf, String email) {
		super(id, name, cpf, email);
	}

	public String getGraduation() {return graduation;}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
