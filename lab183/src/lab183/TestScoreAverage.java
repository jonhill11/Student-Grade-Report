package lab183;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.io.File;
import java.util.Date;

public class TestScoreAverage {
    public static void main(String[] args) {
    	
    	//Get current working directory
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working Directory " + currentDirectory);
        System.getenv("USERNAME");    
        System.out.println("Programmer: Jonathan Hill");
        
        // Print current date and time in format
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy '@' HH:mm");
        Date date = new Date();
        System.out.println("Lab 18.3: " + formatter.format(date)); 
    	System.out.println("");
    	
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask the user to enter 5 test scores
        System.out.print("Enter the first test score: ");
        double score1 = input.nextDouble();
        System.out.print("Enter the second test score: ");
        double score2 = input.nextDouble();
        System.out.print("Enter the third test score: ");
        double score3 = input.nextDouble();
        System.out.print("Enter the fourth test score: ");
        double score4 = input.nextDouble();
        System.out.print("Enter the fifth test score: ");
        double score5 = input.nextDouble();
        System.out.println(name + ", here are the grades and the average:\n");

        // Calculate the average test score
        double averageScore = calcAverage(score1, score2, score3, score4, score5);

        // Show DecimalFormat object with 2 decimal places
        DecimalFormat df = new DecimalFormat("#.00");

        // Show letter grade for each test score and the average
        System.out.println("Test 1: " + determineGrade(score1));
        System.out.println("Test 2: " + determineGrade(score2));
        System.out.println("Test 3: " + determineGrade(score3));
        System.out.println("Test 4: " + determineGrade(score4));
        System.out.println("Test 5: " + determineGrade(score5));
        System.out.printf("Average score: %s\n", df.format(averageScore));
        System.out.printf("Average Letter Grade: %s\n", determineGrade(averageScore));
    }

    // This method calculates the average of the 5 input test scores
    public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
        return (score1 + score2 + score3 + score4 + score5) / 5;
    }

    // This method determines the letter grade for each of the test scores
    public static char determineGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


/*

PSEUDOCODE ALGORITHM

START program

IMPORT Scanner, date, io modules

DECLARE public class TestScoreAverage
	DECLARE main method
	
		GET working directory
		DISPLAY working directory and programmer name
		
		DISPLAY lab number, current date and time at runtime
		CREATE SCANNER object for input
		
		GET user name via input
		GET user's 5 test scores
		
		CALCULATE average test score
		FORMAT with two decimal places
		
		DISPLAY letter grade for each test score and average
		CALCULATE calcAverage method
		CALCULATE determineGrade method
		
END program

*/