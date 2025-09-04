package com.example.sanket.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.sanket.entity.RequestBlood;

@FeignClient(name = "RequestBloodService", path = "/api/v1/request-blood")
public interface NotificationServiceFeign {

    @GetMapping("/{id}")
    RequestBlood getRequestStatus(@PathVariable Long id);
}
