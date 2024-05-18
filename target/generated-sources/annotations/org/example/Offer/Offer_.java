package org.example.Offer;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.sql.Date;
import org.example.Specialization.Specialization;
import org.example.University.University;

@StaticMetamodel(Offer.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Offer_ {

	
	/**
	 * @see org.example.Offer.Offer#specializations
	 **/
	public static volatile ListAttribute<Offer, Specialization> specializations;
	
	/**
	 * @see org.example.Offer.Offer#receiver_id
	 **/
	public static volatile SingularAttribute<Offer, University> receiver_id;
	
	/**
	 * @see org.example.Offer.Offer#offer_start_date
	 **/
	public static volatile SingularAttribute<Offer, Date> offer_start_date;
	
	/**
	 * @see org.example.Offer.Offer#offer_duration
	 **/
	public static volatile SingularAttribute<Offer, Integer> offer_duration;
	
	/**
	 * @see org.example.Offer.Offer#offer_end_date
	 **/
	public static volatile SingularAttribute<Offer, Date> offer_end_date;
	
	/**
	 * @see org.example.Offer.Offer
	 **/
	public static volatile EntityType<Offer> class_;
	
	/**
	 * @see org.example.Offer.Offer#offer_id
	 **/
	public static volatile SingularAttribute<Offer, Integer> offer_id;
	
	/**
	 * @see org.example.Offer.Offer#offer_name
	 **/
	public static volatile SingularAttribute<Offer, String> offer_name;
	
	/**
	 * @see org.example.Offer.Offer#sender_id
	 **/
	public static volatile SingularAttribute<Offer, University> sender_id;

	public static final String SPECIALIZATIONS = "specializations";
	public static final String RECEIVER_ID = "receiver_id";
	public static final String OFFER_START_DATE = "offer_start_date";
	public static final String OFFER_DURATION = "offer_duration";
	public static final String OFFER_END_DATE = "offer_end_date";
	public static final String OFFER_ID = "offer_id";
	public static final String OFFER_NAME = "offer_name";
	public static final String SENDER_ID = "sender_id";

}
