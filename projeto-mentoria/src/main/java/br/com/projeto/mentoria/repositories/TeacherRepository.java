package br.com.projeto.mentoria.repositories;

import br.com.projeto.mentoria.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	Teacher findByCpf(String cpf);
	boolean existsById(Integer id);
	boolean existsByEmail(String email);
	boolean existsByCpf(String cpf);
}
