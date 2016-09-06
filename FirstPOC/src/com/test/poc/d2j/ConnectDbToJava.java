package com.test.poc.d2j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDbToJava {
	
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Ammount","root","aceit");
 String querry="select * from Balance";
 	PreparedStatement stmnt=con.prepareStatement(querry);
   ResultSet s1=stmnt.executeQuery();
  for( int i=1;i<=10;i++){
   if(s1.next()==true){
	   
	   System.out.println("credited balance is:"+s1.getInt(1));
	   System.out.println("debited balance is:"+s1.getInt(2));
	   System.out.println("mix entry is:"+s1.getInt(3));
	   System.out.println("user name is:"+s1.getString(4));
	   System.out.println("id is:"+s1.getInt(5));
   }
  }
 
	   /*if(s1.next()==true){
		   
		   System.out.println("credited balance is:"+s1.getInt(1));
		   System.out.println("debited balance is:"+s1.getInt(2));
		   System.out.println("mixentry is:"+s1.getInt(3));
		   System.out.println("username is:"+s1.getString(4));
	   }
   
   if(s1.next()==true){
	   
	   System.out.println("credited balance is:"+s1.getInt(1));
	   System.out.println("debited balance is:"+s1.getInt(2));
	  System.out.println("mixentry is:"+s1.getInt(3));
	   System.out.println("username is:"+s1.getString(4));
	  
   }*/


   
 }
 
  
}
