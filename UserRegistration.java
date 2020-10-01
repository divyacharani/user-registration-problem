package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome Message
		System.out.println("Welcome to User Registration Program");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name ");
		String firstName = sc.nextLine();
		String pattern = "^[A-Z][Aa-zZ]{2,}$";
		System.out.println(validate(firstName,pattern)+" first name");
		
		sc.close();
	}
	
	//Method to validate
	public static String validate(String str, String pattern) {
		Pattern patternObj = Pattern.compile(pattern);
		Matcher matcher = patternObj.matcher(str);
		if(matcher.matches()) 
			return "Valid";
		else
			return "Invalid";
	}

}
