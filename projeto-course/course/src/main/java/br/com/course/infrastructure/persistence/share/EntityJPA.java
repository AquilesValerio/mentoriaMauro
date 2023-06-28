package br.com.course.infrastructure.persistence.share;

public abstract class EntityJPA<T extends Number> {

	public EntityJPA(T id) {
		this.id = id;
	}

	private T id;

	public T getId() {
		return id;
	}
}
