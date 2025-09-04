package com.example.sanket.services;

import java.util.List;

import com.example.sanket.entity.Donor;

public interface DonorService {
    Donor addDonor(Donor donor);
    Donor updateDonor(Long id, Donor donor);
    List<Donor> getDonorsByBloodGroup(String bloodGroup);
    List<Donor> getDonorsByCity(String city);
    void deleteDonor(Long id);
    Donor getDonorById(Long id);
}
