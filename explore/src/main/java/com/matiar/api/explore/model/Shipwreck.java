package com.matiar.api.explore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Turning the class to the JPA entity
 * 
 * 	JPA:
 * 	The Java Persistence API (JPA), in 2019 renamed to Jakarta Persistence[1], 
 * 	is a Java application programming interface specification that describes 
 * 	the management of relational data in applications using Java Platform, 
 * 	Standard Edition and Java Platform, Enterprise Edition/Jakarta EE
	Persistence in this context covers three areas:
	the API itself, defined in the javax.persistence package
	the Java Persistence Query Language (JPQL)
	object/relational metadata
 */

@Entity
public class Shipwreck {
	// tell which one is the primary key and how to be generated
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String name;
	String description;
	String condition;
	Integer depth;
	Double latitude;
	Double longitude;
	Integer yearDiscovered;

	public Shipwreck() { }

	public Shipwreck(Long id, String name, String description, String condition, Integer depth, Double latitude, Double longitude, Integer yearDiscovered) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
		this.depth = depth;
		this.latitude = latitude;
		this.longitude = longitude;
		this.yearDiscovered = yearDiscovered;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getDepth() {
		return depth;
	}

	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getYearDiscovered() {
		return yearDiscovered;
	}

	public void setYearDiscovered(Integer yearDiscovered) {
		this.yearDiscovered = yearDiscovered;
	}
}
