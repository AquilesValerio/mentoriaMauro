package br.com.course.domain._share.entities;

import br.com.course.domain._share.notification.NotificationPattern;
import java.util.List;

public abstract class Entity<T extends Number>  {
	private T id;

	public Entity(T id) {
		this.id = id;
	}

	public T getId() {
		return id;
	}

	public abstract void validate( NotificationPattern notificationPattern);
}

