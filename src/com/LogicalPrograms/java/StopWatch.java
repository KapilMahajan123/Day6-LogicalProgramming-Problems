package com.LogicalPrograms.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class StopWatch {
	 public static void main(String[] args) {
		
		long startTime = System.nanoTime(); //This method returns the current value of the system timer in nanoseconds
		Scanner scanner = new Scanner(System.in);   //initialize the scanner object
		System.out.println("Enter any number to start : ");  //print and entering any numbers
		int start = scanner.nextInt();      //inserting and find the next int token and print it
		
		//Declare as a long since numbers get too large for int
		long endTime = System.nanoTime();    //Get the ending time in nano second
		System.out.println("Enter any number to stop : ");
		int end = scanner.nextInt();

		System.out.println("stop watch time took " + (startTime - endTime / 1000000000) + " seconds to finish");
							
	 }

}
