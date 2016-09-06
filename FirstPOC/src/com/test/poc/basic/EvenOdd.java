package com.test.poc.basic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		System.out.println("entered number is:"+number);
		if(number % 2 ==0){
			System.out.println("entered number is even number");
		}
		else{
			System.out.println("entered number is odd number");
		}
	}

}
