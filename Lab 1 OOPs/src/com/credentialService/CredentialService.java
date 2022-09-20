package com.credentialService;

import com.model.Employee;

public interface CredentialService {

	public String generateEmailAddress(String fName, String lName, String dept);

	// public String generatePassword();

	// public void showCredentials(Employee emp, String email, String pass);

	public void showCredentials(Employee emp, String email);
}
