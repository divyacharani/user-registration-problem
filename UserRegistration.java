package com.bridgelabz.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static final String FIRST_NAME_PATTERN = "^[A-Z][Aa-zZ]{2,}$";
	public static final String LAST_NAME_PATTERN = "^[A-Z][Aa-zZ]{2,}$";
	public static final String EMAIL_PATTERN = "[\\w+_-]+(?:\\.[\\w_-]+)*@(?:[\\w]+\\.){1,2}[a-zA-Z]{2,}";
	public static final String PHONE_NUMBER_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";
	public static final String PASSWORD_PATTERN = "(?=\\S{8,})(?=.*[A-Z])(?=.*\\d)[\\w\\s]*[^\\w\\s][\\w\\s]*{8,}$";
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome Message
		System.out.println("Welcome to User Registration Program");
		Scanner sc = new Scanner(System.in);

		//First Name Validation
		System.out.println("Enter First Name ");
		String firstName = sc.nextLine();
		if(!(validateFirstName(firstName)))
			System.out.println("First name should have minimum 3 characters and start with Capital letter.");

		//Last Name Validation
		System.out.println("Enter Last Name ");
		String lastName = sc.nextLine();
		if(!(validateLastName(lastName)))
			System.out.println("Last name should have minimum 3 characters and start with Capital letter.");

		//Email Validation
		System.out.println("Enter Email ");
		String email = sc.nextLine();
		if(!(validateEmail(email)))
			System.out.println("Invalid Email ");

		//Phone Number Validation
		System.out.println("Enter Phone Number");
		String phoneNum = sc.nextLine();
		if(!(validatePhoneNumber(phoneNum)))
			System.out.println("Phone number should start with country code followed by space and 10 digit number.");

		//Password Validation
		System.out.println("Enter Password ");
		String password = sc.nextLine();
		if(!(validatePassword(password)))
			System.out.println("Password should contain minimum 8 characters, atleast 1 uppercase letter, atleast 1 numeric number and exactly 1 special character.");
		sc.close();
	}

	//Method to validate first name
	public static boolean validateFirstName(String firstName) {
		Pattern patternObj = Pattern.compile(FIRST_NAME_PATTERN);
		Matcher matcher = patternObj.matcher(firstName);
		if(matcher.matches()) 
			return true;
		else
			return false;
	}
	//Method to validate last name
	public static boolean validateLastName(String lastName) {
		Pattern patternObj = Pattern.compile(LAST_NAME_PATTERN);
		Matcher matcher = patternObj.matcher(lastName);
		if(matcher.matches()) 
			return true;
		else
			return false;
	}
	//Method to validate email
	public static boolean validateEmail(String email) {
		Pattern patternObj = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = patternObj.matcher(email);
		if(matcher.matches()) 
			return true;
		else
			return false;
	}
	//Method to validate phone number
	public static boolean validatePhoneNumber(String phoneNumber) {
		Pattern patternObj = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = patternObj.matcher(phoneNumber);
		if(matcher.matches()) 
			return true;
		else
			return false;
	}
	//Method to validate password
	public static boolean validatePassword(String password) {
		Pattern patternObj = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = patternObj.matcher(password);
		if(matcher.matches()) 
			return true;
		else
			return false;
	}

}
