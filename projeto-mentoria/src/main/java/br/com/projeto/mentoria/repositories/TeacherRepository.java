package br.com.projeto.mentoria.repositories;

import br.com.projeto.mentoria.domain.Teacher;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	Teacher findByCpf(String cpf);
}
