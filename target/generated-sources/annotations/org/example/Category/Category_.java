package org.example.Category;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Category.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Category_ {

	
	/**
	 * @see org.example.Category.Category#category_name
	 **/
	public static volatile SingularAttribute<Category, String> category_name;
	
	/**
	 * @see org.example.Category.Category#category_id
	 **/
	public static volatile SingularAttribute<Category, Integer> category_id;
	
	/**
	 * @see org.example.Category.Category
	 **/
	public static volatile EntityType<Category> class_;

	public static final String CATEGORY_NAME = "category_name";
	public static final String CATEGORY_ID = "category_id";

}

