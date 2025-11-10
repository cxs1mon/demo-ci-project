package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void greetShouldIncludeName() {
        assertEquals("Hello World", App.greet("World"));
    }
    boolean hasSecret = SecretUser.hasSecret();
    @Test
    void hasSecretShouldReturnTrue() {
        assertTrue(hasSecret);
    }
}