package com.bridgelabz;

import java.util.regex.Pattern;

interface Validation {
	public String validate(String regex, String userDetails);
}

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem using lambda");

		Validation isValidFirstName = (pattern, firstName) -> {
			return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
		};
		System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Rutuja"));

		Validation isValidLastName = (pattern, lastName) -> {
			return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
		};
		System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Nandiwadekar"));

		Validation isValidEmail = (pattern, email) -> {
			return "Email is " + Pattern.compile(pattern).matcher(email).matches();
		};
		System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
				"abc.xyz@bl.co.in"));

		Validation isValidMobileNumber = (pattern, mobileNumber) -> {
			return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
		};
		System.out.println(isValidMobileNumber.validate("^[91]+[ ]?[6-9]{1}[0-9]{9}$", "91 9919819801"));

		Validation isValidPassword1 = (pattern, password) -> {
			return "Password rule 1 is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPassword1.validate("^[a-z]{8,}$", "rutujasn"));

		Validation isValidPassword2 = (pattern, password) -> {
			return "Password rule 2 is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPassword2.validate("^[a-z](?=.*[A-Z]).{8,}$", "rutujaSnn"));

		Validation isValidPassword3 = (pattern, password) -> {
			return "Password rule 3 is " + Pattern.compile(pattern).matcher(password).matches();
		};
		System.out.println(isValidPassword3.validate("^[a-z](?=.*[A-Z]+)(?=.*[0-9]+).{8,}$", "rutujaSnn11"));
	}
}
