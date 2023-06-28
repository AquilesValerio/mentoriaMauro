package br.com.course.infrastructure.persistence.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentJPA, Integer> {
}
