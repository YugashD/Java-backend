package com.demo;

import java.util.Optional;

class Student2 {
	String email;
	public Student2(String email) {
		this.email = email;
	}
	Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}
public class OptionalUsage {
	public static void main(String[] args) {
		Student2 s = new Student2(null);
	   Optional<String>  email=  s.getEmail();
	   if (email.isPresent()) {
		System.out.println(email.get().length());
	} else {
		System.out.println("email is not available");

	}
	}
}


