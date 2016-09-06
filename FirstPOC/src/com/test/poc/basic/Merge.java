package com.test.poc.basic;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, x;

		for (i = 5, x = 1; i >= 1; i--, x++) {
			for (j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (k = 5; k >= i; k--) {
				System.out.print("*");
			}

			// for(i=1;i<=6;i++){
			for (j = 1; j < x; j++) {
				System.out.print("*");

			}

			// System.out.println();
			// }
			System.out.println();
		}
	}

}
