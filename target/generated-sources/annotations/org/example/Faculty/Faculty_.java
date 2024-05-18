package org.example.Faculty;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.University.University;

@StaticMetamodel(Faculty.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Faculty_ {

	
	/**
	 * @see org.example.Faculty.Faculty#faculty_name
	 **/
	public static volatile SingularAttribute<Faculty, String> faculty_name;
	
	/**
	 * @see org.example.Faculty.Faculty#faculty_id
	 **/
	public static volatile SingularAttribute<Faculty, Integer> faculty_id;
	
	/**
	 * @see org.example.Faculty.Faculty#university_id
	 **/
	public static volatile SingularAttribute<Faculty, University> university_id;
	
	/**
	 * @see org.example.Faculty.Faculty
	 **/
	public static volatile EntityType<Faculty> class_;

	public static final String FACULTY_NAME = "faculty_name";
	public static final String FACULTY_ID = "faculty_id";
	public static final String UNIVERSITY_ID = "university_id";

}

