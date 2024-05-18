package org.example.City;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.Country.Country;

@StaticMetamodel(City.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class City_ {

	
	/**
	 * @see org.example.City.City#city_name
	 **/
	public static volatile SingularAttribute<City, String> city_name;
	
	/**
	 * @see org.example.City.City
	 **/
	public static volatile EntityType<City> class_;
	
	/**
	 * @see org.example.City.City#country_id
	 **/
	public static volatile SingularAttribute<City, Country> country_id;
	
	/**
	 * @see org.example.City.City#city_id
	 **/
	public static volatile SingularAttribute<City, Integer> city_id;

	public static final String CITY_NAME = "city_name";
	public static final String COUNTRY_ID = "country_id";
	public static final String CITY_ID = "city_id";

}

