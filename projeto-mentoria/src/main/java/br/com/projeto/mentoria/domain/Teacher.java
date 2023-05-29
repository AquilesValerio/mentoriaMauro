package br.com.projeto.mentoria.domain;

import br.com.projeto.mentoria.domain.validator.TeacherValidator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;

@Entity(name = "Teacher")
@Table(name = "Teacher")
public class Teacher extends Person {

	@Column(name = "age", nullable = false)
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public List<String> validated(Person person) {
		TeacherValidator teacherValidator = new TeacherValidator();
		Teacher teacher = (Teacher) person;

		List<String> erros = teacherValidator.validate(teacher);

		if (!erros.isEmpty()) {
			return erros;
		} else {
			return null;
		}
	}
}