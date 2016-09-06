package com.test.poc.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//File file = new File("E://file.txt");
		//FileReader fr = new FileReader(file);
		 int[] number = {1,2,3,4};
		System.out.println(number[5]); 
	}

}
