package com.gurpreet.developer.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//To be able to store Point objects in the database using JPA 
//we need to define an entity class. 
//A JPA entity class is a POJO (Plain Old Java Object) class, 
//i.e. an ordinary Java class that is marked (annotated)
//as having the ability to represent objects in the database.
//Lombok has something called @data to import G,s,tO,NoA
//installed lombok from lombok project so getter and seetr is not needed/
//when did getter and setter, ToString was not being used
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString 
@EqualsAndHashCode
public class Car {
    @Id 
    @GeneratedValue
    private Long id;
    private @NonNull String name;
    
    //Don't need anymore because of Lombok
//	public void setName(String name2) {
//		// TODO Auto-generated method stub
//		this.name = name2;
//		
//	}
//	public Object getName() {
//		// TODO Auto-generated method stub
//		return name;
//	}
}