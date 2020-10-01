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
		
		//First Name Validation
		System.out.println("Enter First Name ");
		String firstName = sc.nextLine();
		String pattern = "^[A-Z][Aa-zZ]{2,}$";
		System.out.println(validate(firstName,pattern)+" first name");
		
		//Last Name Validation
		System.out.println("Enter Last Name ");
		String lastName = sc.nextLine();
		pattern = "^[A-Z][Aa-zZ]{2,}$";
		System.out.println(validate(lastName,pattern)+" last name");
		
		//Email Validation
		System.out.println("Enter Email ");
		String email = sc.nextLine();
		pattern = "[\\w\\d+-_]+(?:\\.[\\w\\d+-_]+)*@(?:[\\w\\d]+\\.)+[\\w]{2,}";
		System.out.println(validate(email,pattern)+" email");
		
		//Phone Number Validation
		System.out.println("Enter Phone Number");
		String phoneNum = sc.nextLine();
		pattern = "^[0-9]{2}[\\s][0-9]{10}$";
		System.out.println(validate(phoneNum,pattern)+" phone number");
		
		//Password Validation
		System.out.println("Enter Password ");
		String password = sc.nextLine();
		pattern = "^(?=.*[A-Z]).{8,}$";
		System.out.println(validate(password,pattern));

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
