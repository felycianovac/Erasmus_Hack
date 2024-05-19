package org.example.Offer;

import org.example.University.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer>, JpaSpecificationExecutor<Offer>{
    boolean existsByOfferNameAndSenderIdAndReceiverId(String offer_name, University senderId, University receiverId);

}
