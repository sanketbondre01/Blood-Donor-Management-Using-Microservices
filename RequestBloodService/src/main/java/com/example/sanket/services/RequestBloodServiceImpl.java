package com.example.sanket.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.example.sanket.Feign.RequestBloodServiceFeign;
import com.example.sanket.entity.Blood;
import com.example.sanket.entity.RequestBlood;
import com.example.sanket.enums.RequestStatus;
import com.example.sanket.exception.RequestNotFoundException;
import com.example.sanket.repo.RequestBloodRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestBloodServiceImpl implements RequestBloodService {

    private final RequestBloodRepository requestBloodRepository;
    private final RequestBloodServiceFeign requestBloodServiceFeign;

    @Override
    public RequestBlood addRequest(RequestBlood requestBlood) {
        requestBlood.setStatus(RequestStatus.PENDING);
        return requestBloodRepository.save(requestBlood);
    }

    @Override
    public List<RequestBlood> getAllRequests() {
        return requestBloodRepository.findAll();
    }

    @Override
    public RequestBlood getRequestStatus(Long id) {
        return requestBloodRepository.findById(id)
                .orElseThrow(() -> new RequestNotFoundException("Request with ID " + id + " not found"));
    }
    public List<Blood> getAllBloodFromOtherService() {
        return requestBloodServiceFeign.getAllBlood();
    }
}
