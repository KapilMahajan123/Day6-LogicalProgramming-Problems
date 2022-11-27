package com.LogicalPrograms.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class PerfectNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);      //Scanner input
		System.out.println("Enter Number:~ ");      //print enter number
		int number = sc.nextInt();   //reads the number from the user
		int result =0;
		for(int i = 1; i<=number/2; i++) {   //Executes until the condition 
				if(number % i == 0) {
					result = result + i;      //Calculates the sum of factors
				}
			}
		if(result == number)          //Compares result with the number
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect number");
		
	}

		
}
