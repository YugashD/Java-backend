package com.collections;

import java.time.LocalDate;
import java.time.LocalTime;

public class JavaAPI {
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDate dateOfBirth = LocalDate.of(2000, 01, 01);
		System.out.println("Now: "+today+", "+time);
		System.out.println("Date of Birth: "+dateOfBirth);
	}
}
