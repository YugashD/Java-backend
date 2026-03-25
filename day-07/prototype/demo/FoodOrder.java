package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FoodOrder {
	public FoodOrder() {
		System.out.println("New food order created");
	
	}
	
	public void serve() {
		System.out.println("Serving food....");
	}

}
