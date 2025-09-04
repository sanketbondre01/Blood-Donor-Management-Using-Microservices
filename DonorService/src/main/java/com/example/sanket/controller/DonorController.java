package com.example.sanket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.example.sanket.entity.Donor;
import com.example.sanket.services.DonorService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/donor")
@RequiredArgsConstructor
public class DonorController {

    private final DonorService donorService;

    @PostMapping("/add")
    public Donor addDonor(@Valid @RequestBody Donor donor) {
        return donorService.addDonor(donor);
    }

    @PutMapping("/{id}")
    public Donor updateDonor(@PathVariable Long id, @Valid @RequestBody Donor donor) {
        return donorService.updateDonor(id, donor);
    }

    @GetMapping("/bloodGroup/{bloodGroup}")
    public List<Donor> getDonorsByBloodGroup(@PathVariable String bloodGroup) {
        return donorService.getDonorsByBloodGroup(bloodGroup);
    }

    @GetMapping("/city/{city}")
    public List<Donor> getDonorsByCity(@PathVariable String city) {
        return donorService.getDonorsByCity(city);
    }

    @DeleteMapping("/{id}")
    public String deleteDonor(@PathVariable Long id) {
        donorService.deleteDonor(id);
        return "Donor deleted successfully";
    }

    @GetMapping("/{id}")
    public Donor getDonorById(@PathVariable Long id) {
        return donorService.getDonorById(id);
    }
}
