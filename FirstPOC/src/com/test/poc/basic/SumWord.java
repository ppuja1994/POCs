package com.test.poc.basic;

import java.util.Scanner;

public class SumWord {

	
	
	
	public static void main(String[] args) {
		boolean bln = false;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check:");
		String a = sc.next();
		for (int i = 0; i <= a.length(); i++) {
			sum = sum + i;
			bln = true;
		}
		System.out.println("sum is:" + sum);
	}

	private static int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
