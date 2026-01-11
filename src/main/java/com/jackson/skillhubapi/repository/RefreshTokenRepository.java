package com.jackson.skillhubapi.repository;

import com.jackson.skillhubapi.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

}
