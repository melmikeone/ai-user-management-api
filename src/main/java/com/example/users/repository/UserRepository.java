package com.example.users.repository;

import com.example.users.domain.User;

public interface UserRepository {

    User save(User user);
}