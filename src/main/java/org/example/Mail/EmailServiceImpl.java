package org.example.Mail;

import org.example.Offer.Offer;
import org.example.Offer.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    private JavaMailSender javaMailSender;

    @Autowired
    private OfferService offerService;

    @Value("${spring.mail.username}")
    private String username;

    public String sendMail(SubscriptionRequest emailDetails) {
        try {
            Offer offer = offerService.getOfferByIdRecommendation(emailDetails.getOffer_id());
            String emailContent = buildEmailContent(offer);

            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(username);
            mailMessage.setTo(emailDetails.getEmail());
            mailMessage.setSubject("Don't miss this offer!");
            mailMessage.setText(emailContent);

            javaMailSender.send(mailMessage);
            return "Mail sent successfully";
        } catch (Exception e) {
            return "Mail not sent";
        }
    }

    private String buildEmailContent(Offer offer) {
        StringBuilder content = new StringBuilder();
        String offerURL = "http://172.20.115.183:3000/offer/" + offer.getOffer_id();
        content.append("You have subscribed to the offer: ").append(offer.getOfferName()).append("\n")
                .append("Offer URL: ").append(offerURL).append("\n")
                .append("Deadline: ").append(offer.getOffer_end_date()).append("\n")
                .append("Please take the necessary actions before the deadline.");
        return content.toString();
    }
}
