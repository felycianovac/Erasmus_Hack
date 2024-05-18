package org.example.Offer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.University.University;
import org.example.Specialization.Specialization;

import java.sql.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offer_id")
    private Integer offer_id;

    @Column(name = "offer_name")
    private String offer_name;

    @Transient
    private Integer offer_duration;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    private Date offer_start_date;

    @Column(name = "end_date")
    private Date offer_end_date;

    @Column(name = "program_start")
    private Date program_start;

    @Column(name = "program_end")
    private Date program_end;

    @Column(name = "language")
    private String language;

    @ManyToOne
    @JoinColumn(name = "receiver_id", referencedColumnName = "university_id")
    private University receiver_id;

    @OneToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "university_id")
    private University sender_id;

    @ManyToMany
    @JoinTable(
            name = "Offer_Specialization",
            joinColumns = @JoinColumn(name = "offer_id"),
            inverseJoinColumns = @JoinColumn(name = "specialization_id")
    )
    private List<Specialization> specializations;
}
