package org.example.University;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.Country.Country;

@StaticMetamodel(University.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
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
	 * @see org.example.University.University#country_id
	 **/
	public static volatile SingularAttribute<University, Country> country_id;

	public static final String UNIVERSITY_ID = "university_id";
	public static final String UNIVERSITY_NAME = "university_name";
	public static final String COUNTRY_ID = "country_id";

}

