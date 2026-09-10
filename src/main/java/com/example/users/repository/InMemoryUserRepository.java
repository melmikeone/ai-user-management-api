package com.example.users.repository;

import com.example.users.domain.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {

	private final Map<String, User> users = new HashMap<>();

	@Override
	public User save(User user) {
		users.put(user.getEmail(), user);
		return user;
	}
}
