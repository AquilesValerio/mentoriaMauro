package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.repositories.TeacherRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {


	public List<Teacher> getAll(){
		return new TeacherRepository().getAll();
	}

	public Teacher getById(int id){
		return new TeacherRepository().getById(id);
	}

	public Teacher insert(Teacher object){
		return new TeacherRepository().insert(object);
	}

	public void update(Teacher object, int id){
		new TeacherRepository().update(object);
	}

	public void delete(int id){
		new TeacherRepository().delete(id);
	}
}
