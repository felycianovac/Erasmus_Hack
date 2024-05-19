package org.example.Offer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/offers")
public class OfferController {

    private final OfferService offerService;

    @Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @PostMapping()
    public ResponseEntity<String> createOffer(@RequestBody OfferDTO offerDTO) {
        Offer createdOffer = offerService.createOffer(offerDTO);
        return ResponseEntity.ok("ok");




    }
    @GetMapping
    public List<OfferResponse> getOffers(
            @RequestParam(required = false) Integer university,
            @RequestParam(required = false) Integer speciality,
            @RequestParam(required = false) Integer semester,
            @RequestParam(required = false) String searchTerm,
            @RequestParam(required = false) Integer country,
            @RequestParam(required = false) Integer city,
            @RequestParam(required = false) List<Integer> duration,
            @RequestParam(required = false) Integer category,
            @RequestParam(required = false) String language,
            @RequestParam(required = false) Integer scholarshipMin,
            @RequestParam(required = false) Integer scholarshipMax
    ) {
        return offerService.getFilteredOffers(university, speciality, semester, searchTerm, country, city, duration, category, language, scholarshipMin, scholarshipMax);
    }
    @GetMapping("/{id}")
    public ResponseEntity<OfferResponse> getOfferById(@PathVariable Integer id) {
        OfferResponse offer = offerService.getOfferById(id);
        if (offer != null) {
            return ResponseEntity.ok(offer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
