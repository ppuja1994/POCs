package com.test.poc.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
	public static void main(String[] args) {
		boolean exit = false;
		do  {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of students:");

			try {

				int number = sc.nextInt();
				for (int i = 1; i <= number; i++) {

					System.out.println("name:");
					String name = sc.next();
					System.out.println("enter age");
					int age = sc.nextInt();
					System.out.println("enter gender:");
					String gender = sc.next();
					System.out.println("name is:" + name);
					System.out.println("age is:" + age);
					System.out.println("gender is:" + gender);
					
				}
				exit = true;
			}

			catch (InputMismatchException e) {

				System.out.println("enter numbers only..");

			}
			
		}
		while(!exit);
	}
}