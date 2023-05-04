package br.com.projeto.mentoria.repositories;

import br.com.projeto.mentoria.domain.Teacher;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherRepository {


	public List<Teacher> getAll(){
		System.out.println("Buscando todos");
		return null;
	}

	public Teacher getById(int id){
		System.out.println("Buscando id" + id);
		return null;
	}

	public Teacher insert(Teacher teacher){
		System.out.println("salvando" + teacher);
		return null;
	}

	public Teacher update(Teacher teacher){
		System.out.println("atualizando" + teacher);
		return null;
	}

	public void delete(int id){}
}
