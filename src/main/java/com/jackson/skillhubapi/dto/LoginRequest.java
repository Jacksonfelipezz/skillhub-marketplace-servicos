package com.jackson.skillhubapi.dto;

public record LoginRequest(
        String email,
        String password
) {}
