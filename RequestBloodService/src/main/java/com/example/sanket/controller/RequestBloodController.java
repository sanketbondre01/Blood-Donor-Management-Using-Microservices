package com.example.sanket.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.sanket.entity.Blood;
import com.example.sanket.entity.RequestBlood;
import com.example.sanket.services.RequestBloodService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/request-blood")
@RequiredArgsConstructor
public class RequestBloodController {

    private final RequestBloodService requestBloodService;

    @PostMapping
    public RequestBlood addRequest(@Valid @RequestBody RequestBlood requestBlood) {
        return requestBloodService.addRequest(requestBlood);
    }

    @GetMapping
    public List<RequestBlood> getAllRequests() {
        return requestBloodService.getAllRequests();
    }

    @GetMapping("/{id}")
    public RequestBlood getRequestStatus(@PathVariable Long id) {
        return requestBloodService.getRequestStatus(id);
    }

    
    @GetMapping("/blood-all")
    public List<Blood> getAllBlood() {
        return requestBloodService.getAllBloodFromOtherService();
    }
    

}
