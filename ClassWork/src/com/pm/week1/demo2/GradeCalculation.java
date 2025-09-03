package com.pm.week1.demo2;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Get student name
		System.out.print("Enter student name: ");
		String studentName = scanner.nextLine();
		
		// Get number of subjects
		System.out.print("\nEnter number of subjects: ");
		int numSubjects = scanner.nextInt();
		
		// Array to store grades
		double[] grades = new double[numSubjects];
		double total = 0;
		
		// Loop to input grades and calculate total
		for (int i = 0; i < numSubjects; i++) {
			System.out.print("Enter grade for subject " + (i + 1) + ": ");
			grades[i] = scanner.nextDouble();
			total += grades[i];
		}
		
		double average = total / numSubjects;
		
		String status = (average >= 60) ? "Pass" : "Fail";
		
		System.out.println("\nStudent: " + studentName);
		System.out.println("Average Grade: " + average);
		System.out.println("Status: " + status);
		
		scanner.close();
	}

	
}
