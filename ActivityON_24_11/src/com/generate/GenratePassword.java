package com.generate;
import java.util.Random; // generate random numbers

public class GenratePassword {

	public static void main(String[] args) {
		System.out.println(generatepassword(8));

	}
	
	private static char [] generatepassword(int length) {
		String Uppercase = "ABCDEFGHIJKLMNOPQRSTVUWXYZ";
	   String lowercase = "abcdefghijklmnopqrstwuvwxyz";
	   String SpecialCharacters = "!@#$%^&*()_-+=";
	   String Numbers = "1234567890";
	   String combination = Uppercase+lowercase+SpecialCharacters+Numbers;
	   Random ran = new Random();
	   char [] password = new char [ length];
	   password[0]= lowercase.charAt(ran.nextInt(lowercase.length()));
	   password[1]= Uppercase.charAt(ran.nextInt(Uppercase.length()));
	   password[2]= SpecialCharacters.charAt(ran.nextInt(SpecialCharacters.length()));
	   password[3]= Numbers.charAt(ran.nextInt(Numbers.length()));
	   
	   for(int i=4; i<length; i++) {
		   
		   password[i] = combination.charAt(ran.nextInt(combination.length()));
	   }
	   
	   System.out.println("password" );
	return password;
	   
			   
		
		
	}

}
