package org.example.Specialization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Specialization")
public class Specialization {
    @Id
    @Column(name = "specialization_id")
    private Integer specialization_id;

    @Column(name = "specialization_name")
    private String specialization_name;
}