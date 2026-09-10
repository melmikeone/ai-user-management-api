package com.example.users.domain;

public final class User {

    private final String name;
    private final String email;

    public User(String name, String email) {
        validateEmail(email);
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    private static void validateEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email must not be null or blank");
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex != email.lastIndexOf('@') || atIndex == email.length() - 1) {
            throw new IllegalArgumentException("Email must contain a local part and a domain");
        }
    }
}