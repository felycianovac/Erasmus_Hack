package org.example.Country;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Country.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Country_ {

	
	/**
	 * @see org.example.Country.Country#country_name
	 **/
	public static volatile SingularAttribute<Country, String> country_name;
	
	/**
	 * @see org.example.Country.Country
	 **/
	public static volatile EntityType<Country> class_;
	
	/**
	 * @see org.example.Country.Country#country_id
	 **/
	public static volatile SingularAttribute<Country, String> country_id;

	public static final String COUNTRY_NAME = "country_name";
	public static final String COUNTRY_ID = "country_id";

}

