package com.springcore;

public class Student {
	private int StudentId;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting student ID: ");
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Setting student name: ");
		StudentName = studentName;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting student address: ");
		StudentAddress = studentAddress;
	}

	private String StudentName;
	private String StudentAddress;

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
		/*
		 * We have generated this method because When we print the object these things
		 * will be printed too..
		 */
	}

}
