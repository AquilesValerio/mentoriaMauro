package br.com.projeto.mentoria.services;

import br.com.projeto.mentoria.domain.DTO.ChangeStatusTeacher;
import br.com.projeto.mentoria.domain.Person;
import br.com.projeto.mentoria.domain.Teacher;
import br.com.projeto.mentoria.repositories.TeacherRepository;
import br.com.projeto.mentoria.exceptions.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

	private final TeacherRepository teacherRepository;

	public TeacherService(TeacherRepository teacherRepository) {
		this.teacherRepository = teacherRepository;
	}

	public List<Teacher> findAll() {
		return teacherRepository.findAll();
	}

	public Teacher findById(int id) {
		var result = teacherRepository.findById(id);
		return result.orElseThrow(() -> new ApiException("Entity not found.", HttpStatus.NOT_FOUND));
	}

	public Teacher insert(Teacher object) {
		validate(object);
		validateStatus(object);
		return save(object);
	}

	private void validate(Teacher teacher) {
		List<String> erros = teacher.validated();
		if (!erros.isEmpty()) {
			throw new ApiException(erros, HttpStatus.BAD_REQUEST);
		}
	}

	private Teacher validateStatus(Teacher object) {
		var teacher = teacherRepository.findByCpf(object.getCpf());
		if (teacher == null) {
			return object;
		}
		if (teacher.getStatus()) {
			throw new ApiException("This teacher is already exists and your status is active.",
				HttpStatus.CONFLICT);
		} else {
			throw new ApiException("This teacher is already exists and your status is desactive.",
				HttpStatus.BAD_REQUEST);
		}
	}

	private Teacher save(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public void update(Teacher object, int id) {
		validate(object);
		verifyTeacherExists(id);
		verifyEmailExists(object.getEmail());
		verifyCpfExists(object.getCpf());
		object.setId(id);
		save(object);
	}
	private void verifyTeacherExists(int id){
		if(!teacherRepository.existsById(id)){
			throw new ApiException("Register not found", HttpStatus.NOT_FOUND);
		}
	}
	private void verifyEmailExists(String email){
		if(!teacherRepository.existsByEmail(email)){
			throw new ApiException("Register not found", HttpStatus.NOT_FOUND);
		}
	}
	private void verifyCpfExists(String cpf){
		if(!teacherRepository.existsByCpf(cpf)){
			throw new ApiException("Register not found", HttpStatus.NOT_FOUND);
		}
	}

	public void partialUpdate(ChangeStatusTeacher object, int id) {
		//Verificar se o status teve alteracao/ email e cpf ja existem no banco?
		save(buildNewTeacher(object, id));
	}

	private Teacher buildNewTeacher(ChangeStatusTeacher object, int id) {
		var temporary = teacherRepository.findById(id);
		if (temporary.isEmpty()) {
			throw new ApiException("Teacher not found", HttpStatus.NOT_FOUND);
		}
		var teacher = temporary.get();
		teacher.setStatus(object.status());
		return teacher;
	}



	public void delete(int id) {
		teacherRepository.deleteById(id);
	}


	/*private void Reflexao(Person people) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			// Serializa o objeto em uma string JSON
			String jsonString = objectMapper.writeValueAsString(people);
			System.out.println("Objeto serializado em JSON: " + jsonString);

			//acessando todas as propriedades
			var props = people.getClass().getDeclaredFields();
			for (var prop : props) { //percorre cada prop

				try {
					var nameProp = prop.getName();//recupera nome da prop
					System.out.println(nameProp);

					prop.setAccessible(true);//vai dar erro na linha abiaxo se a prop for private, essa linha permite
					// acessar
					var valueProp = prop.get(people);//recupera valor da prod
					System.out.println(Optional.ofNullable(valueProp).map(Object::toString).orElse(""));
				} catch (Exception ex) {
					var e = ex.getMessage();
				}
			}

			//alterando valor em tempo de execução
			var propFilhod = people.getClass()
				.getField("TesteDosFera"); //acessa a prop TesteDosFera que está na classe filha
			propFilhod.set(people, "Teste dos Feras setado em tempo de execução"); //seta um valor pra ela

			var propObject = propFilhod.get(people); //recupera valor

			System.out.println(propObject.toString());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}*/
}
