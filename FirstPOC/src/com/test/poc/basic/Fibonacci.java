package com.test.poc.basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth number");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int next;

		for (int i = 0; i <= n; i++) {
			if (i <= 1) {
				next = i;
				System.out.println(i);
			} else {
				next = first + second;
				first = second;
				second = next;
				System.out.println(next);
			}

		}

	}

}
