package com.example.users.service;

import com.example.users.domain.User;
import com.example.users.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User createUser(String name, String email) {
		User user = new User(name, email);
		return userRepository.save(user);
	}
}
