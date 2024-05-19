package org.example.Mail;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class SubscriptionRequest {
    private String email;
    private Integer offer_id;
}
