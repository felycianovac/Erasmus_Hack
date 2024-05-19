package org.example.Specialization;

import org.example.University.University;
import org.example.University.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecializationService {
    private final SpecializationRepository specializationRepository;
    private final UniversityRepository universityRepository;

    @Autowired
    public SpecializationService(SpecializationRepository specializationRepository, UniversityRepository universityRepository) {
        this.specializationRepository = specializationRepository;
        this.universityRepository = universityRepository;
    }

    public List<SpecializationDTO> getSpecializationsByUniversityId(Integer university_id) {
        University university = universityRepository.findById(university_id).get();
        List<Specialization> specializations = specializationRepository.findSpecializationsByUniversityId(university);
        return specializations.stream()
                .map(specialization -> SpecializationDTO.builder()
                        .specialization_id(specialization.getSpecialization_id())
                        .specialization_name(specialization.getSpecialization_name())
                        .build())
                .collect(Collectors.toList());
    }
}
