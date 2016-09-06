package com.test.poc.basic;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		int total = 0;
		while(total < 50){
			 System.out.println("enter score");
			Scanner sc = new Scanner(System.in);
			int score = sc.nextInt();
			if(score == 1){
				break;
			}
			else{
				total = total + score;
			}
			System.out.println("total score is:"+total);
		}
		if(total >= 50){
			System.out.println("winner:"+total);
			
		}
		else{
			System.out.println("ur total score:"+total+"u lost");
		}
	}

}
