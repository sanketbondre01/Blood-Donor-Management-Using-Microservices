package com.example.sanket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sanket.entity.Donor;

import java.util.List;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodGroup(String bloodGroup);
    List<Donor> findByCity(String city);
}
