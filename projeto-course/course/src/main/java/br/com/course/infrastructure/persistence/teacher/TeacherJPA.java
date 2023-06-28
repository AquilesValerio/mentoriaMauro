package br.com.course.infrastructure.persistence.teacher;

import br.com.course.infrastructure.persistence.share.PersonJPA;
import jakarta.persistence.Column;

public class TeacherJPA extends PersonJPA<Integer> {

	public TeacherJPA(Integer id, String name, String cpf, String email) {
		super(id, name, cpf, email);
	}

	@Column(name = "graduation", nullable = false, length = 50)
	private String graduation;
	@Column(name = "course", nullable = false, length = 50)
	private int courseId;

	public String getGraduation() {
		return graduation;
	}

	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}

	public int getCourse() {
		return courseId;
	}

	public void setCourse(int courseId) {
		this.courseId = courseId;
	}
}
