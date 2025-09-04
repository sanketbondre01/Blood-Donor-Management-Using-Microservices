package com.example.sanket.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.sanket.Feign.BloodServiceFeign;
import com.example.sanket.entity.Blood;
import com.example.sanket.entity.Donor;
import com.example.sanket.exception.BloodNotFoundException;
import com.example.sanket.repo.BloodRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BloodServiceImpl implements BloodService {

    private final BloodRepository bloodRepository;
    private final BloodServiceFeign bloodServiceFeign;


    @Override
    public Blood addBloodGroup(Blood blood) {
        return bloodRepository.save(blood);
    }

    @Override
    public List<Blood> getBloodGroups() {
        return bloodRepository.findAll();
    }

    @Override
    public Blood updateBloodStatus(Long id, String status) {
        Blood b = bloodRepository.findById(id).orElseThrow();
        b.setStatus(status);
        return bloodRepository.save(b);
    }
    @Override
    public Blood getBloodById(Long id) {
        return bloodRepository.findById(id)
                .orElseThrow(() -> new BloodNotFoundException("Blood record not found with ID: " + id));
    }
    @Override
    public List<Donor> getDonorsByBloodGroup(String bloodGroup) {
        return bloodServiceFeign.getDonorsByBloodGroup(bloodGroup);
    }

}
