package br.com.projeto.mentoria.repositories;

import br.com.projeto.mentoria.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface GenericTeacherRepository extends JpaRepository<Teacher, Integer> {
}
