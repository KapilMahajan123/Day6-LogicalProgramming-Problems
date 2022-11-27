package com.LogicalPrograms.java;

/**
 * 
 * @author Kapil
 *
 */
public class CouponNumbers {
	
	public static void main(String[] args) {
		
		//it returns a newly allocated char array
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();  
		int max=100000000;   
		
		//return a random integer between specified values
		int random=(int) (Math.random()*max);	//To generate a random number in a given range maximum is exclusive
		StringBuffer stringbuffer=new StringBuffer();    //string buffer class is used to create mutable string objects
		
		while (random>0)      //long as a random is grater than 0
		{
			stringbuffer.append(chars[random % chars.length]);   //append chars arguments
			random /= chars.length;
		}

		String couponCode=stringbuffer.toString();
		System.out.println("Coupon Code: "+couponCode);	

    }


}
