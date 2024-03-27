package com.javaex.oop.person;

public class Student extends Person {
	private String schoolName;
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		
		System.out.println("	Student (3 parameters)");
	}	
	
	public Student(String schoolName) {
		super("Unknown", 0);
		this.schoolName = schoolName;
		
		System.out.println("	Student (1 parameter)");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("School: " + schoolName);
	}
	
	
	
}
