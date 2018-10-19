package com.gmail.fitanns;

public class Student extends Human {

	private String sex;

	private String name;
	private String surname;

	public Student(int age, String nationality, String colorSkin, double height, double weight, String sex, String name,
			String surname) {
		super(age, nationality, colorSkin, height, weight);
		this.sex = sex;

		this.name = name;
		this.surname = surname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "sex=" + sex + ",  name=" + name + ", surname=" + surname + ", " + super.toString();
	}

}
