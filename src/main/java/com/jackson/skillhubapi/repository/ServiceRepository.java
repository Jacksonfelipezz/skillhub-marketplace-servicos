package com.jackson.skillhubapi.repository;

import com.jackson.skillhubapi.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Servico, Long> {
}
