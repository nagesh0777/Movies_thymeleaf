package com.example.Movies_thymeleaf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String description;
private String image;
private String trailer;
private String rating;
public int getId() {
	return id;
}
public void setId(int id) {
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
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTrailer() {
	return trailer;
}
public void setTrailer(String trailer) {
	this.trailer = trailer;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}

}
