package org.example.Specialization;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Offer.Offer;

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
}