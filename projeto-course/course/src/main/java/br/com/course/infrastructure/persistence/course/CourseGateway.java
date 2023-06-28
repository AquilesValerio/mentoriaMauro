package br.com.course.infrastructure.persistence.course;

public class CourseGateway {
	private final CourseRepository courseRepository;

	public CourseGateway(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public CourseRepository getCourseRepository() {
		return courseRepository;
	}
}
