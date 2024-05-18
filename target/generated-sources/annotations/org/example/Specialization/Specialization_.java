package org.example.Specialization;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.Course.Course;
import org.example.Offer.Offer;

@StaticMetamodel(Specialization.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Specialization_ {

	
	/**
	 * @see org.example.Specialization.Specialization#offers
	 **/
	public static volatile ListAttribute<Specialization, Offer> offers;
	
	/**
	 * @see org.example.Specialization.Specialization#courses
	 **/
	public static volatile ListAttribute<Specialization, Course> courses;
	
	/**
	 * @see org.example.Specialization.Specialization#specialization_id
	 **/
	public static volatile SingularAttribute<Specialization, Integer> specialization_id;
	
	/**
	 * @see org.example.Specialization.Specialization#specialization_name
	 **/
	public static volatile SingularAttribute<Specialization, String> specialization_name;
	
	/**
	 * @see org.example.Specialization.Specialization
	 **/
	public static volatile EntityType<Specialization> class_;

	public static final String OFFERS = "offers";
	public static final String COURSES = "courses";
	public static final String SPECIALIZATION_ID = "specialization_id";
	public static final String SPECIALIZATION_NAME = "specialization_name";

}
