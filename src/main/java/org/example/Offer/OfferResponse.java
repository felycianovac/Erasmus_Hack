package org.example.Offer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Specialization.SpecializationDTO;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OfferResponse {
    private Integer id;
    private String offer_name;
    private String country_name;
    private String city_name;
    private String university_name;
    private String description;
    private String offer_end_date;
    private String offer_start_date;
    private Date program_start;
    private Date program_end;
    private Integer scholarship;
    private String language;
    private String receiver_name;
    private List<SpecializationDTO> specializations;

}
