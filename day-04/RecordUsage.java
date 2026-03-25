package com.demo;

record Student4 (String name, int age, int marks) {
}
public class RecordUsage {
	public static void main(String[] args) {
		Student4 student=new Student4("ABC", 20, 90);
		System.out.println(student.name());
		System.out.println(student.age());
		System.out.println(student.marks());
	}
}
