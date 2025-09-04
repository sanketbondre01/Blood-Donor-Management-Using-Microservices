package com.example.sanket.services;

import java.util.List;

import com.example.sanket.entity.Blood;
import com.example.sanket.entity.Donor;
import com.example.sanket.exception.BloodNotFoundException;

public interface BloodService {
    
    Blood addBloodGroup(Blood blood);
    
    List<Blood> getBloodGroups();
    
    Blood getBloodById(Long id);
    Blood updateBloodStatus(Long id, String status) throws BloodNotFoundException;

	List<Donor> getDonorsByBloodGroup(String bloodGroup);
}
