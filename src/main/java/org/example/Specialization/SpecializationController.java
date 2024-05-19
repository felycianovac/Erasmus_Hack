package org.example.Specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/specializations")
public class SpecializationController {
    private final SpecializationService specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @GetMapping("/{university_id}")
    public ResponseEntity<List<SpecializationDTO>> getSpecializationsByUniversityId(@PathVariable("university_id") Integer universityId) {
        List<SpecializationDTO> specializationDTOs = specializationService.getSpecializationsByUniversityId(universityId);
        return ResponseEntity.ok(specializationDTOs);
    }
}
