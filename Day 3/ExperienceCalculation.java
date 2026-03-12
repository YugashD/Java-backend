package com.collections;

import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculation {
	public static void main(String[] args) {
		LocalDate joiningDate = LocalDate.of(2020, 3, 10);
		LocalDate today = LocalDate.now();
		Period experience = Period.between(joiningDate, today);
		System.out.println("Exper" + experience.getYears() + "-- years " + experience.getMonths());
	}
}
