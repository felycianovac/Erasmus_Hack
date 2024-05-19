package org.example.Specialization;

import org.example.Course.Course;
import org.example.Course.CourseDTO;

import org.example.University.University;
import org.example.University.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecializationService {
    @Autowired
    private  SpecializationRepository specializationRepository;
    @Autowired
    private  UniversityRepository universityRepository;


    public SpecializationResponse getSpecializationDetails(Integer mineSpecializationId, Integer offerSpecializationId, Integer semester) {
        Specialization offerSpecialization = specializationRepository.findById(offerSpecializationId)
                .orElseThrow(() -> new RuntimeException("Offer specialization not found"));

        List<CourseDTO> availableCourses = offerSpecialization.getCourses().stream()
                .filter(course -> semester == null || course.getCourse_semester().equals(semester))
                .map(this::mapToCourseDTO)
                .collect(Collectors.toList());

        if (mineSpecializationId == null) {
            return SpecializationResponse.builder()
                    .available_courses(availableCourses)
                    .covered_courses(Collections.emptyList())
                    .not_covered_courses(Collections.emptyList())
                    .build();
        }

        Specialization mineSpecialization = specializationRepository.findById(mineSpecializationId)
                .orElseThrow(() -> new RuntimeException("Mine specialization not found"));

        List<CourseDTO> mineCourses = mineSpecialization.getCourses().stream()
                .filter(course -> semester == null || course.getCourse_semester().equals(semester))
                .map(this::mapToCourseDTO)
                .collect(Collectors.toList());

        List<CourseDTO> coveredCourses = availableCourses.stream()
                .filter(availableCourse -> mineCourses.stream()
                        .anyMatch(mineCourse -> mineCourse.getCourse_name().equals(availableCourse.getCourse_name()) &&
                                Math.abs(mineCourse.getCredits() - availableCourse.getCredits()) <= 2))
                .collect(Collectors.toList());

        List<CourseDTO> notCoveredCourses = mineCourses.stream()
                .filter(mineCourse -> availableCourses.stream()
                        .noneMatch(availableCourse -> availableCourse.getCourse_name().equals(mineCourse.getCourse_name()) &&
                                Math.abs(mineCourse.getCredits() - availableCourse.getCredits()) <= 2))
                .collect(Collectors.toList());

        return SpecializationResponse.builder()
                .available_courses(availableCourses)
                .covered_courses(coveredCourses)
                .not_covered_courses(notCoveredCourses)
                .build();
    }

    private CourseDTO mapToCourseDTO(Course course) {
        return CourseDTO.builder()
                .course_name(course.getCourse_name())
                .credits(course.getCourse_credits())
                .build();
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
