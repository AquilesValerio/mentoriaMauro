package br.com.course.infrastructure.persistence.student;

public class StudentGateway {
	private StudentRepository studentRepository;

	public StudentGateway(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
}
