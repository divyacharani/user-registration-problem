package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static final String FIRST_NAME_PATTERN = "^[A-Z][Aa-zZ]{2,}$";
	public static final String LAST_NAME_PATTERN = "^[A-Z][Aa-zZ]{2,}$";
	public static final String EMAIL_PATTERN = "[\\w+_-]+(?:\\.[\\w_-]+)*@(?:[\\w]+\\.)+[a-zA-Z]{2,}";
	public static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome Message
		System.out.println("Welcome to User Registration Program");
		Scanner sc = new Scanner(System.in);
		
		//First Name Validation
		System.out.println("Enter First Name ");
		String firstName = sc.nextLine();
		System.out.println(validate(firstName,FIRST_NAME_PATTERN)+" first name");
		
		//Last Name Validation
		System.out.println("Enter Last Name ");
		String lastName = sc.nextLine();
		System.out.println(validate(lastName,LAST_NAME_PATTERN)+" last name");
		
		//Email Validation
		System.out.println("Enter Email ");
		String email = sc.nextLine();
		System.out.println(validate(email,EMAIL_PATTERN)+" email");
		
		//Phone Number Validation
		System.out.println("Enter Phone Number");
		String phoneNum = sc.nextLine();
		System.out.println(validate(phoneNum,PHONE_NUMBER_PATTERN)+" phone number");
		
		//Password Validation
		System.out.println("Enter Password ");
		String password = sc.nextLine();
		System.out.println(validate(password,PASSWORD_PATTERN)+" password");

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
