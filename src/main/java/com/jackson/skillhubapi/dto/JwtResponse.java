package com.jackson.skillhubapi.dto;

public record JwtResponse(
        String accessToken,
        String refreshTokenToken
) {
}
