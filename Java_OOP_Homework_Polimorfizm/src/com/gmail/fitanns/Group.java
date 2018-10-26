package com.gmail.fitanns;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {

	private Student z[] = new Student[10];

	public Group(Student[] z) {
		super();
		this.z = z;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student[] getZ() {
		return z;
	}

	public void setZ(Student[] z) {
		this.z = z;
	}

	public void addStudent(Student unknownStudent) {
		for (int i = 0; i < z.length; i++) {
			try {
				if (z[i] == null) {
					z[i] = unknownStudent;
					System.out.println("Это студент: " + unknownStudent.toString());
					break;
				}
				if (i == z.length - 1) {
					throw new FullException();
				}
			} catch (FullException e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public void interactiveAddStudent() {
		Student twelfthStudent = new Student();
		int age;

		String name;
		String surname;

		for (int i = 0; i < z.length; i++) {
			try {
				if (z[i] == null) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Введите возраст студента");
					age = sc.nextInt();
					if (age < 18) {
						throw new IllegalArgumentException();
					} else {
						twelfthStudent.setAge(age);
					}

					Scanner sx = new Scanner(System.in);
					System.out.println("Введите имя студента");
					name = sx.nextLine();
					twelfthStudent.setName(name);

					Scanner sz = new Scanner(System.in);
					System.out.println("Введите фамилию студента");
					surname = sz.nextLine();
					twelfthStudent.setSurname(surname);

					if (i == z.length - 1) {
						throw new FullException();
					}

				}
			} catch (FullException e) {
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException b) {
				System.out.println("You input invalid value");
			}
			z[i] = twelfthStudent;
			System.out.println("Это студент: " + "name=" + twelfthStudent.getName() + " surname="
					+ twelfthStudent.getSurname() + " age=" + twelfthStudent.getAge());
			break;
		}
	}

	public void arraySortStudent(Student[] student) {
		Arrays.sort(student);
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}

	@Override
	public Student[] godniy() {
		Student[] godniy = new Student[10];
		for (int i = 0; i < z.length; i++) {
			if ((z[i] != null) && (z[i].getAge() >= 18) && (z[i].getSex() == "male")
					&& (z[i].getNationality() == "ukrainian")) {
				godniy[i] = z[i];
				System.out.println("Военкомат вас ждёт: " + godniy[i].toString());
			} else {
				if (z[i].getSex() == "female") {
					System.out.println("Это девушка,а они военкому не нужны " + z[i].toString());
					System.out.println();
				}
				if (z[i].getAge() < 18) {
					System.out.println("Вы ещё не совершеннолетние,к вам это не относиться: " + z[i].toString());
				}
			}
		}
		return godniy;
	}

	public void deleteStudent(Student unknownStudent) {

		for (int i = 0; i < z.length; i++) {
			if (z[i] == unknownStudent) {
				z[i] = null;
			}
			System.out.println(unknownStudent.getName() + " " + unknownStudent.getSurname()
					+ " - Такого студента больше нет в группе");
			break;
		}
	}

	public Student findSurname(String surname) {

		Student student = null;
		for (int i = 0; i < z.length; i++) {

			if (z[i].getSurname().equals(surname)) {
				student = z[i];
				System.out.println("Такой студент есть в группе: " + z[i]);
				break;
			}

			if (i == z.length - 1) {
				student = null;
				System.out.println("Такого студента в этой группе нету");

			}
		}
		return student;
	}

	@Override
	public String toString() {
		return "Group [z=" + Arrays.toString(z) + "]";
	}

}
