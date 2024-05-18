package org.example.Offer;

import org.example.University.University;
import org.example.University.UniversityRepository;
import org.example.Specialization.Specialization;
import org.example.Specialization.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfferService {

    private final OfferRepository offerRepository;
    private final UniversityRepository universityRepository;
    private final SpecializationRepository specializationRepository;

    @Autowired
    public OfferService(OfferRepository offerRepository, UniversityRepository universityRepository, SpecializationRepository specializationRepository) {
        this.offerRepository = offerRepository;
        this.universityRepository = universityRepository;
        this.specializationRepository = specializationRepository;
    }

    public Offer createOffer(OfferDTO offerDTO) {
        University sender = universityRepository.findById(offerDTO.getUniversity_sender())
                .orElseThrow(() -> new RuntimeException("Sender University not found"));
        University receiver = universityRepository.findById(offerDTO.getUniversity_receiver())
                .orElseThrow(() -> new RuntimeException("Receiver University not found"));

        List<Specialization> specializations = offerDTO.getSpecializations().stream()
                .map(specializationDTO -> specializationRepository.findById(specializationDTO.getSpecialization_id())
                        .orElseThrow(() -> new RuntimeException("Specialization not found")))
                .collect(Collectors.toList());

        Offer offer = Offer.builder()
                .offer_name(offerDTO.getOffer_name())
                .description(offerDTO.getDescription())
                .offer_start_date(offerDTO.getOffer_start_date())
                .offer_end_date(offerDTO.getOffer_end_date())
                .program_start(offerDTO.getProgram_start())
                .program_end(offerDTO.getProgram_end())
                .scholarship(offerDTO.getScholarship())
                .sender_id(sender)
                .receiver_id(receiver)
                .specializations(specializations)
                .build();

        return offerRepository.save(offer);
    }
}
