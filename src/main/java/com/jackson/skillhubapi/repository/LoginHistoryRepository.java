package com.jackson.skillhubapi.repository;

import com.jackson.skillhubapi.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {

}
