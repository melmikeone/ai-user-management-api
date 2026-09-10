package com.example.users.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    @Test
    void shouldAcceptValidEmail() {
        assertDoesNotThrow(() ->
                new User("John Doe", "john.doe@example.com")
        );
    }

    @Test
    void shouldRejectEmailWithoutAtSymbol() {
        assertThrows(IllegalArgumentException.class, () ->
                new User("John Doe", "john.doe.example.com")
        );
    }

    @Test
    void shouldRejectEmailWithoutDomain() {
        assertThrows(IllegalArgumentException.class, () ->
                new User("John Doe", "john@")
        );
    }

    @Test
    void shouldRejectEmptyEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                new User("John Doe", "")
        );
    }

    @Test
    void shouldRejectNullEmail() {
        assertThrows(IllegalArgumentException.class, () ->
                new User("John Doe", null)
        );
    }
}
