package org.example.Course;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import org.example.Specialization.Specialization;

@StaticMetamodel(Course.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Course_ {

	
	/**
	 * @see org.example.Course.Course#course_id
	 **/
	public static volatile SingularAttribute<Course, Integer> course_id;
	
	/**
	 * @see org.example.Course.Course#course_semester
	 **/
	public static volatile SingularAttribute<Course, Integer> course_semester;
	
	/**
	 * @see org.example.Course.Course#specializations
	 **/
	public static volatile ListAttribute<Course, Specialization> specializations;
	
	/**
	 * @see org.example.Course.Course#course_name
	 **/
	public static volatile SingularAttribute<Course, String> course_name;
	
	/**
	 * @see org.example.Course.Course
	 **/
	public static volatile EntityType<Course> class_;
	
	/**
	 * @see org.example.Course.Course#course_credits
	 **/
	public static volatile SingularAttribute<Course, Integer> course_credits;

	public static final String COURSE_ID = "course_id";
	public static final String COURSE_SEMESTER = "course_semester";
	public static final String SPECIALIZATIONS = "specializations";
	public static final String COURSE_NAME = "course_name";
	public static final String COURSE_CREDITS = "course_credits";

}

