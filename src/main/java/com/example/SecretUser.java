package com.example;

public class SecretUser {
    public static boolean hasSecret() {
        String secret = System.getenv("APP_SECRET_TOKEN");
        return secret != null && !secret.isBlank();
    }
}