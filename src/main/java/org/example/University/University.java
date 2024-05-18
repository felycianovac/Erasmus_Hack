package org.example.University;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Country.Country;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private Integer university_id;

    @Column(name = "university_name")
    private String university_name;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Country country_id;
}
