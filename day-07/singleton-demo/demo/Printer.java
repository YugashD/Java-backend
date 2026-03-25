package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Printer {
	
	public Printer() {
		System.out.println("Printer object is created");
	}
	public void printMessage() {
		System.out.println("Printing document");
	}

}
