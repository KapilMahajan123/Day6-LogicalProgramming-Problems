package com.LogicalPrograms.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		//Take input from the user
		//Create instance of the Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");

		int size = scanner.nextInt();  //Declare and Initalize the number of terms
		int num1 = 0, num2 = 1;
		int num3;

		// Print the number 0 and 1 here in the scanner container.

		System.out.println("Fibonacci Series of: " + size);
		System.out.println(num1 + " " + num2);
		for (int i = 2; i <= size; i++) {

			// here adding the number 0+1
			num3 = num1 + num2;
			System.out.println(" " + num3);

			// Now here the Swapping values.

			num1 = num2;
			num2 = num3;

		}
		
	}

}
	
