package com.test.poc.basic;

import java.util.Scanner;

public class PrintTenTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter name");
		 String name=sc.next();
		 int i=0;
		 int k=0;
		 while(i<=9){
			 System.out.println(name);
			 i++;
		 }
		 for(int j=0;j<3;j++){
			 System.out.println("entered name is:"+name);
			
				}
		 do{
			 k++;
			 System.out.println("ram"+ " " +name);
			 }
			 while(k<=5);
		 }


}
