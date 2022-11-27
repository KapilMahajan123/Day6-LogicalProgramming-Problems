package com.LogicalPrograms.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number: ");
	int number = sc.nextInt();
	boolean isPrime = true;
	for (int i = 0; i < number / 2; i++) {   //check if the numbers is divisible by any number in given range
		if (number % 2 == 0) {   //condition for no prime number
			isPrime = false;   //Prime is set to false
		}
	}
	if (isPrime == true)       //If condition set to true
		System.out.println(number + " is Prime");
	else
		System.out.println(number + " is Not Prime");
}

}
