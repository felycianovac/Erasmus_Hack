package org.example.Specialization;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Course.Course;
import org.example.Offer.Offer;
//import org.example.Offer.Offer;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Specialization")
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialization_id")
    private Integer specialization_id;

    @Column(name = "specialization_name")
    private String specialization_name;

    @ManyToMany(mappedBy = "specializations")
    private List<Offer> offers;

    @ManyToMany
    @JoinTable(
            name = "Specialization_Course", // Name of the join table
            joinColumns = @JoinColumn(name = "specialization_id"), // Foreign key for Specialization in join table
            inverseJoinColumns = @JoinColumn(name = "course_id") // Foreign key for Course in join table
    )
    private List<Course> courses;
}