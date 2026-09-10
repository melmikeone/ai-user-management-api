package com.example.users.repository;

import com.example.users.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class InMemoryUserRepositoryTest {

	@Test
	void shouldSaveUserAndReturnTheSameInstance() {
		InMemoryUserRepository repository = new InMemoryUserRepository();
		User user = new User("John Doe", "john.doe@example.com");

		User savedUser = repository.save(user);

		assertSame(user, savedUser);
	}
}
