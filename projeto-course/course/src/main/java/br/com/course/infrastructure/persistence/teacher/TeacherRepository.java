package br.com.course.infrastructure.persistence.teacher;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository  extends JpaRepository<TeacherJPA, Integer> {
}
