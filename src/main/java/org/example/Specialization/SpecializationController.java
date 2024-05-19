package org.example.Specialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/specialization")
public class SpecializationController {

    @Autowired
    private SpecializationService specializationService;

    @GetMapping("/{id}")
    public SpecializationResponse getSpecializationById(@PathVariable("id") Integer mineSpecializationId,
                                                        @RequestParam("specialization_id") Integer offerSpecializationId,
                                                        @RequestParam("sem") Integer semester) {
        return specializationService.getSpecializationDetails(mineSpecializationId, offerSpecializationId, semester);
    }
}
