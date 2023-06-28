package br.com.course.infrastructure.persistence.teacher;

public class TeacherGateway {
	private final TeacherRepository teacherRepository;

	public TeacherGateway(TeacherRepository teacherRepository){
		this.teacherRepository = teacherRepository;
	}

	public TeacherRepository getTeacherRepository() {
		return teacherRepository;
	}


}
