package com.gmail.fitanns;

import java.util.Arrays;

public class Group {

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
