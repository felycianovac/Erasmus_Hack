package org.example.Offer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@Table(name = "Offer")

public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offer_id")
    private Integer offer_id;

    @Column(name = "offer_name")
    private String offerName;

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

    @Column(name = "scholarship")
    private Integer scholarship;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "receiver_id", referencedColumnName = "university_id")
    private University receiverId;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "sender_id", referencedColumnName = "university_id")
    private University senderId;

    @ManyToMany
    @JoinTable(
            name = "Offer_Specialization",
            joinColumns = @JoinColumn(name = "offer_id"),
            inverseJoinColumns = @JoinColumn(name = "specialization_id")
    )
    @JsonManagedReference
    private List<Specialization> specializations;
}
