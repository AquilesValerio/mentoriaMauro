package br.com.course.infrastructure.persistence.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseJPA, Integer> {
}
