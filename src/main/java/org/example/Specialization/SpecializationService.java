package org.example.Specialization;

import org.example.University.University;
import org.example.University.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationService {
    private final SpecializationRepository specializationRepository;
    private final UniversityRepository universityRepository;

    @Autowired
    public SpecializationService(SpecializationRepository specializationRepository, UniversityRepository universityRepository) {
        this.specializationRepository = specializationRepository;
        this.universityRepository = universityRepository;
    }

    public List<Specialization> getSpecializationsByUniversityId(Integer university_id) {
        University university = universityRepository.findById(university_id).get();
        return specializationRepository.findSpecializationsByUniversityId(university);
    }
}
