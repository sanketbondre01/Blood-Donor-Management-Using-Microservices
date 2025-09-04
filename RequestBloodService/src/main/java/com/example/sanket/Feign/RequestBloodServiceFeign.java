package com.example.sanket.Feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.example.sanket.entity.Blood;




@FeignClient(name = "BloodService", path = "/api/v1/blood")
public interface RequestBloodServiceFeign {

	@GetMapping("/all")
	public List<Blood> getAllBlood() ;


    @GetMapping("/id/{id}")
    Blood getBloodById(@PathVariable("id") Long id);

    
}
