package com.example.sanket.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.sanket.entity.Donor;
import com.example.sanket.exception.DonorNotFoundException;
import com.example.sanket.repo.DonorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonorServiceImpl implements DonorService {

    private final DonorRepository donorRepository;

    @Override
    public Donor addDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    @Override
    public Donor updateDonor(Long id, Donor donor) {
        Donor existing = donorRepository.findById(id)
                .orElseThrow(() -> new DonorNotFoundException(id));
        existing.setName(donor.getName());
        existing.setBloodGroup(donor.getBloodGroup());
        existing.setCity(donor.getCity());
        
        existing.setAge(donor.getAge());
        existing.setEmail(donor.getEmail());
        return donorRepository.save(existing);
    }

    @Override
    public Donor getDonorById(Long id) {
        return donorRepository.findById(id)
                .orElseThrow(() -> new DonorNotFoundException(id));
    }

    @Override
    public List<Donor> getDonorsByBloodGroup(String bloodGroup) {
        return donorRepository.findByBloodGroup(bloodGroup);
    }

    @Override
    public List<Donor> getDonorsByCity(String city) {
        return donorRepository.findByCity(city);
    }

    

    @Override
    public void deleteDonor(Long id) {
        Donor existing = donorRepository.findById(id)
                .orElseThrow(() -> new DonorNotFoundException(id));
        donorRepository.delete(existing);
    }

	

	
    
}
