package com.test.poc.basic;

public class StarThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
   for( i=5;i>=1;i--){
	   for( j=1;j<=i-1;j++){
		   System.out.print(" ");
	   }
	   for( k=5;k>=i;k--){
	   System.out.print("*");
	   }
	   System.out.println();
   }
   /*for(i=4;i>=1;i--){
		for(j=5;j>i;j--){
			System.out.print(" ");
		}
		for(k=1;k<=i;k++){
			System.out.print("*");
		}
		System.out.println();
	}*/
   
	}

}
