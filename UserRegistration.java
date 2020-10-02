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
		validateFirstName(firstName);

		//Last Name Validation
		System.out.println("Enter Last Name ");
		String lastName = sc.nextLine();
		validateLastName(lastName);
			
		//Email Validation
		System.out.println("Enter Email ");
		String email = sc.nextLine();
		validateEmail(email);

		//Phone Number Validation
		System.out.println("Enter Phone Number");
		String phoneNum = sc.nextLine();
		validatePhoneNumber(phoneNum);

		//Password Validation
		System.out.println("Enter Password ");
		String password = sc.nextLine();
		validatePassword(password);

		sc.close();
	}

	//Method to validate first name
	public static boolean validateFirstName(String firstName) {
		String message = "Invalid!! First name should have minimum 3 characters and start with Capital letter.";
		try {
			validation(firstName,FIRST_NAME_PATTERN,message);
			return true;
		}
		catch(InvalidEntryException e) {
			e.printStackTrace();
		}
		return false;
	}
	//Method to validate last name
	public static boolean validateLastName(String lastName) {
		String message = "Invalid!! Last name should have minimum 3 characters and start with Capital letter.";
		try {
			validation(lastName,LAST_NAME_PATTERN,message);
			return true;
		}
		catch(InvalidEntryException e) {
			e.printStackTrace();
		}
		return false;
	}
	//Method to validate email
	public static boolean validateEmail(String email) {
		String message = "Invalid Email!!";
		try {
			validation(email,EMAIL_PATTERN,message);
			return true;
		}
		catch(InvalidEntryException e) {
			e.printStackTrace();
		}
		return false;
	}
	//Method to validate phone number
	public static boolean validatePhoneNumber(String phoneNumber) {
		String message = "Phone number should start with country code followed by space and 10 digit number.";
		try {
			validation(phoneNumber,PHONE_NUMBER_PATTERN,message);
			return true;
		}
		catch(InvalidEntryException e) {
			e.printStackTrace();
		}
		return false;
	}
	//Method to validate password
	public static boolean validatePassword(String password) {
		String message = "Password should contain minimum 8 characters, atleast 1 uppercase letter, atleast 1 numeric number and exactly 1 special character";
		try {
			validation(password,PASSWORD_PATTERN,message);
			return true;
		}
		catch(InvalidEntryException e) {
			e.printStackTrace();
		}
		return false;
	}
	//Method to implement exception
	public static void validation(String str, String pattern, String message) throws InvalidEntryException {
		Pattern patternObj = Pattern.compile(pattern);
		Matcher matcher = patternObj.matcher(str);
		if(!(matcher.matches()))
			throw new InvalidEntryException(message);	

	}

}
