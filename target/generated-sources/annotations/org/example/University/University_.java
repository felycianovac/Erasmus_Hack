package org.example.University;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.City.City;

@StaticMetamodel(University.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class University_ {

	
	/**
	 * @see org.example.University.University#university_id
	 **/
	public static volatile SingularAttribute<University, Integer> university_id;
	
	/**
	 * @see org.example.University.University#university_name
	 **/
	public static volatile SingularAttribute<University, String> university_name;
	
	/**
	 * @see org.example.University.University
	 **/
	public static volatile EntityType<University> class_;
	
	/**
	 * @see org.example.University.University#city_id
	 **/
	public static volatile SingularAttribute<University, City> city_id;

	public static final String UNIVERSITY_ID = "university_id";
	public static final String UNIVERSITY_NAME = "university_name";
	public static final String CITY_ID = "city_id";

}

