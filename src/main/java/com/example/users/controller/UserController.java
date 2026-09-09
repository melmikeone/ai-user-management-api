package com.example.users.controller;

import com.example.users.domain.User;
import com.example.users.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody CreateUserRequest request) {
		User user = userService.createUser(request.getName(), request.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
}
