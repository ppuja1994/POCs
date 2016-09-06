package com.test.poc.basic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value1");
		int a = sc.nextInt();
		System.out.println("enter value2");
		int b = sc.nextInt();
		System.out.println("entered numbers are:"+a+" "+b);
		
		int c = b;
		int d = a;
		System.out.println("swapped numbers are:"+c+" "+d);
		
	}

}
