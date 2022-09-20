package com.credentialService;

import java.util.Random;

import com.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	public String generatePassword() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*(){}[];:'<>?,./-+`~|";
		StringBuilder password = new StringBuilder(7);
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			password = password.append(characters.charAt(random.nextInt(characters.length())));
		}
		return password.toString();
	}

	@Override
	public String generateEmailAddress(String fName, String lName, String dept) {
		String email = fName.toLowerCase() + lName.toLowerCase() + "@" + dept + ".gl.in";
		return email;
	}

	@Override
	public void showCredentials(Employee emp, String email) {
		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email: " + email);
		System.out.println("Password: " + generatePassword());
	}

}
