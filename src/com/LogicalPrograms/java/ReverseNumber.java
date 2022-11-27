package com.LogicalPrograms.java;

import java.util.Scanner;

/**
 * 
 * @author Kapil
 *
 */
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();   //reads the number from the user
		System.out.println("Original Number: "+number);     //print this original numbers
		int reverse=0, remain;      //variables initialization
		
		//Loop to find reverse numbers
		while(number != 0)   //checking if number is reduced to zero or not
		{
			remain = number % 10;
			reverse = reverse* 10 + remain;
			number = number / 10 ;     //reducing the digits in number
		}
		System.out.println("Reversed Number: "+reverse);  //print the output
	 }

}
