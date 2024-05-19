package org.example.Specialization;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Course.CourseDTO;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpecializationResponse {
    private List<CourseDTO> available_courses;
    private List<CourseDTO> covered_courses;
    private List<CourseDTO> not_covered_courses;
}