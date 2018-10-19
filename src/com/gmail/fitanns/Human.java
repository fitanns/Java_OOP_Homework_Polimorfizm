package com.gmail.fitanns;

public class Human {
	private int age;
	private String nationality;
	private String colorSkin;
	private double height;
	private double weight;

	public Human(int age, String nationality, String colorSkin, double height, double weight) {
		super();
		this.age = age;
		this.nationality = nationality;
		this.colorSkin = colorSkin;
		this.height = height;
		this.weight = weight;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getColorSkin() {
		return colorSkin;
	}

	public void setColorSkin(String colorSkin) {
		this.colorSkin = colorSkin;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "age=" + age + ", nationality=" + nationality + ", colorSkin=" + colorSkin + ", height=" + height
				+ ", weight=" + weight + "";
	}

}
