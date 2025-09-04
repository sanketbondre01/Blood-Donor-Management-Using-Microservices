package com.example.sanket.services;

import java.util.List;

import com.example.sanket.entity.Blood;
import com.example.sanket.entity.RequestBlood;

public interface RequestBloodService {
    RequestBlood addRequest(RequestBlood requestBlood);
    List<RequestBlood> getAllRequests();
    RequestBlood getRequestStatus(Long id);
	List<Blood> getAllBloodFromOtherService();
}
