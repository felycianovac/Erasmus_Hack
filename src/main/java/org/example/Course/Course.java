package org.example.Course;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Specialization.Specialization;

import java.util.List;

@Data //generate getters and setters
@Builder //build object
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Integer course_id;

    @Column(name = "course_name")
    private String course_name;

    @Column(name = "course_credits")
    private Integer course_credits;

    @Column(name = "course_semester")
    private Integer course_semester;

    @ManyToMany(mappedBy = "courses")
    private List<Specialization> specializations;
}
