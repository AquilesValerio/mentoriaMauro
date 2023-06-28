package br.com.course.infrastructure.persistence.schedulingCourse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulingCourseRepository extends JpaRepository<SchedulingCourseJPA, Integer> {
}
