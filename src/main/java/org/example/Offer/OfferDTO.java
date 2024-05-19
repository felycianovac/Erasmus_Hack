package org.example.Offer;

import lombok.*;
import org.example.Specialization.SpecializationDTO;


import java.util.List;
import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class OfferDTO {
    private Integer sender_id;
    private Integer receiver_id;
    private String offer_name;
    private String description;
    private Date offer_end_date;
    private Date offer_start_date;
    private Date program_start;
    private Date program_end;
    private Integer scholarship;
    private String language;
    private List<SpecializationDTO> specializations;


}
