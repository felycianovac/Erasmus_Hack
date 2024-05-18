package org.example.Faculty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.University.University;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Faculty {
    @Id
    @Column(name = "faculty_id")
    private Integer faculty_id;

    @Column(name = "faculty_name")
    private String faculty_name;

    @ManyToOne
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    private University university_id;
}
