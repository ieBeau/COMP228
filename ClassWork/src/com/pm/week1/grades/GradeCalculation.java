package com.pm.week1.grades;

import java.util.Scanner;

/*
 * This program calculates the final grade for a student based on their scores.
 * Program prints the grade based on the final score.
 * If the average of marks is >= 80 then print "Grade: A"
 * If the average is < 80 and >= 60 then print "Grade: B"
 * If the average is < 60 and >= 40 then print "Grade: C"
 * If the average is < 40 then print "Grade: D"
 */

public class GradeCalculation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the number of subjects: ");
        int numSubjects = scan.nextInt();
        
        double[] scores = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            scores[i] = scan.nextDouble();
        }

        char grade = calculateGrade(scores);
        System.out.println("\nFinal Grade: " + grade + "\n");

        scan.close();
    }

    public static char calculateGrade(double[] scores) {
        double average = calculateAverage(scores);
        if (average >= 80) return 'A';
        else if (average >= 60) return 'B';
        else if (average >= 40) return 'C';
        else return 'D';
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
