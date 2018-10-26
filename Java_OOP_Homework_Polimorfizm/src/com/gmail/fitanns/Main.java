package com.gmail.fitanns;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Human human = new Human();
		Group group = new Group();

		Student firstStudent = new Student(18, "ukrainian", "white", 180, 77, "male", "Alex", "Kolysnichenko");
		Student secondStudent = new Student(19, "chinese", "yellow", 165, 65, "male", "Ni", "Yong");
		Student thirdStudent = new Student(20, "ukrainian", "white", 185, 75, "male", "Alex", "Kolivoshko");
		Student fourthStudent = new Student(18, "ukrainian", "white", 170, 55, "male", "Dmitry", "Ognenko");
		Student fifthStudent = new Student(18, "ukrainian", "white", 175, 54, "female", "Olesya", "Virchenko");
		Student sixthStudent = new Student(17, "ukrainian", "white", 184, 90, "male", "Eugene", "Dybina");
		Student seventhStudent = new Student(21, "ukrainian", "white", 165, 70, "male", "Bogdan", "Kovalenko");
		Student eighthStudent = new Student(18, "ukrainian", "white", 164, 53, "female", "Victoria", "Mazur");
		Student ninthStudent = new Student(18, "african", "black", 186, 77, "male", "Nebr", "Origen");
		Student tenthStudent = new Student(19, "ukrainian", "white", 167, 64, "male", "Anatoly", "Zderko");
		Student eleventhStudent = new Student(19, "ukrainian", "white", 165, 64, "male", "Anatoly", "Berko");

		Student[] array = new Student[] { firstStudent, secondStudent, thirdStudent, fourthStudent, fifthStudent,
				sixthStudent, seventhStudent, eighthStudent, ninthStudent, tenthStudent, eleventhStudent };
		System.out.println();

		group.arraySortStudent(array);

		group.interactiveAddStudent();

		group.addStudent(firstStudent);
		group.addStudent(secondStudent);
		group.addStudent(thirdStudent);
		group.addStudent(fourthStudent);
		group.addStudent(fifthStudent);
		group.addStudent(sixthStudent);
		group.addStudent(seventhStudent);
		group.addStudent(eighthStudent);
		group.addStudent(ninthStudent);
		System.out.println();

		group.addStudent(eleventhStudent);
		System.out.println();

		group.deleteStudent(eighthStudent);
		System.out.println();

		group.findSurname("Origen");
		group.findSurname("Klichko");
		System.out.println();

		group.godniy();
		System.out.println();
	}

}
