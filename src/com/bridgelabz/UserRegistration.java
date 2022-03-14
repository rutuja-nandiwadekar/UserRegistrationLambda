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
	}
}
