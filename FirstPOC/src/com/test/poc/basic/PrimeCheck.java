package com.test.poc.basic;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int number = sc.nextInt();
		int m = number / 2;
		boolean comp = false;
		for (int i = 2; i <= m; i++) {
			if (number % i == 0) {
				comp = true;
			}

		}
		if (comp == true) {
			System.out.println(" entered number is not prime number");
		} else {
			System.out.println(" entered number is prime number");
		}
	}

}
