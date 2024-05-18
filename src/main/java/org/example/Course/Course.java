package org.example.Course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //generate getters and setters
@Builder //build object
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @Column(name = "course_id")
    private Integer course_id;

    @Column(name = "category_name")
    private String category_name;

    @Column(name = "course_credits")
    private Integer course_credits;

    @Column(name = "course_semester")
    private Integer course_semester;
}
