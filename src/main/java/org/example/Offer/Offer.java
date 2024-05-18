package org.example.Offer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.University.University;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Offer {
    @Id
    @Column(name = "offer_id")
    private Integer offer_id;

    @Column(name = "offer_name")
    private String offer_name;

    @Column(name = "offer_duration")
    private Integer offer_duration;

    @Column(name = "start_date")
    private Date offer_start_date;

    @Column(name = "end_date")
    private Date offer_end_date;

    @ManyToOne
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    private University receiver_id;

    @OneToOne
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    private University sender_id;

}
