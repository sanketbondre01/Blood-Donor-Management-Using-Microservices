package com.example.sanket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.sanket.entity.Blood;
import com.example.sanket.entity.Donor;
import com.example.sanket.services.BloodService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blood")
@RequiredArgsConstructor
public class BloodController {

    private final BloodService bloodService;

    @PostMapping("/add")
    public Blood addBloodGroup(@RequestBody Blood blood) {
        return bloodService.addBloodGroup(blood);
    }

    @GetMapping("/all")
    public List<Blood> getBloodGroups() {
        return bloodService.getBloodGroups();
    }

    @PutMapping("/updateStatus")
    public Blood updateBloodStatus(@RequestParam Long id, @RequestParam String status) {
        return bloodService.updateBloodStatus(id, status);
    }
    @GetMapping("/{id}")
    public Blood getBloodById(@PathVariable Long id) {
        return bloodService.getBloodById(id);
    }
    @GetMapping("/donors/{bloodGroup}")
    public List<Donor> getDonorsByBloodGroup(@PathVariable String bloodGroup) {
        return bloodService.getDonorsByBloodGroup(bloodGroup);
    }
}
