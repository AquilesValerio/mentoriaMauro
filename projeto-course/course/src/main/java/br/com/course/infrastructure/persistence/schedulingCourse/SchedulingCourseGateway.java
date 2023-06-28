package br.com.course.infrastructure.persistence.schedulingCourse;

public class SchedulingCourseGateway {
	private final SchedulingCourseRepository schedulingCourseRepository;

	public SchedulingCourseGateway(SchedulingCourseRepository schedulingCourseRepository)
	{this.schedulingCourseRepository = schedulingCourseRepository;}

	public SchedulingCourseRepository getSchedulingCourseRepository() {
		return schedulingCourseRepository;
	}

}
