package com.demo;

class Student {
	String email;
	public Student(String email) {
		this.email = email;
	}
	String getEmail() {
		return email;
	}
}
public class GetterUsage {
	public static void main(String[] args) {
		Student s = new Student(null);
		String email = s.getEmail();
		System.out.println(email.length());
	}
}
