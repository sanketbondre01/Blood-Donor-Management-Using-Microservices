package com.example.sanket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sanket.entity.Blood;

public interface BloodRepository extends JpaRepository<Blood, Long> {
}
