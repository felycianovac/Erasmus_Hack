package org.example.Specialization;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.Category.Category;
import org.example.Course.Course;
import org.example.Offer.Offer;
import org.example.University.University;

@StaticMetamodel(Specialization.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Specialization_ {

	
	/**
	 * @see org.example.Specialization.Specialization#offers
	 **/
	public static volatile ListAttribute<Specialization, Offer> offers;
	
	/**
	 * @see org.example.Specialization.Specialization#universityId
	 **/
	public static volatile SingularAttribute<Specialization, University> universityId;
	
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
	 * @see org.example.Specialization.Specialization#category_id
	 **/
	public static volatile SingularAttribute<Specialization, Category> category_id;
	
	/**
	 * @see org.example.Specialization.Specialization
	 **/
	public static volatile EntityType<Specialization> class_;

	public static final String OFFERS = "offers";
	public static final String UNIVERSITY_ID = "universityId";
	public static final String COURSES = "courses";
	public static final String SPECIALIZATION_ID = "specialization_id";
	public static final String SPECIALIZATION_NAME = "specialization_name";
	public static final String CATEGORY_ID = "category_id";

}

