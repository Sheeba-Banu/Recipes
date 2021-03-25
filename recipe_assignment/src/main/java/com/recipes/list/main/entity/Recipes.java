package com.recipes.list.main.entity;





import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "food_type")
	private String foodType;
	
	@Column(name = "order_count")
	private int orderCount;
	
	@Column(name = "date_created")
	private String dateCreated;
	
	@Column(name = "instructions")
	private String instructions;
	
	@Column(name = "ingredients")
	private String ingredients;
	

	// Default constructor
	public Recipes() {
	}

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

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int headIntake) {
		this.orderCount = headIntake;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Recipes [id=" + id + ", name=" + name + ", description=" + description + ", foodType=" + foodType
				+ ", orderCount=" + orderCount + ", dateCreated=" + dateCreated + ", instructions=" + instructions
				+ ", ingredients=" + ingredients + "]";
	}

}
