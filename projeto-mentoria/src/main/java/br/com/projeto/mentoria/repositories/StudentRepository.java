package br.com.projeto.mentoria.repositories;

import br.com.projeto.mentoria.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
