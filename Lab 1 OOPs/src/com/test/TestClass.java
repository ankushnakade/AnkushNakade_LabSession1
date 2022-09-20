package com.test;

import java.util.HashMap;
import java.util.Scanner;

import com.credentialService.CredentialServiceImpl;
import com.model.Employee;

public class TestClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first name: ");
		String fName = scanner.nextLine();

		if (fName.isBlank()) {
			System.out.println("First Name cannot be empty");
			return;
		}

		System.out.println("Enter last name: ");
		String lName = scanner.nextLine();

		if (lName.isBlank()) {
			System.out.println("Last Name cannot be empty");
			return;
		}

		Employee e1 = new Employee(fName, lName);
		CredentialServiceImpl credentialServiceImpl = new CredentialServiceImpl();
		String email = "";

		HashMap<Integer, String> deptMapping = new HashMap<>();
		deptMapping.put(1, "tech");
		deptMapping.put(2, "admin");
		deptMapping.put(3, "hr");
		deptMapping.put(4, "legal");

		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = scanner.nextInt();

		if (option < 1 || option > 4) {
			System.out.println("Invalid option selected");
			return;
		}

		email = credentialServiceImpl.generateEmailAddress(e1.getFirstName(), e1.getLastName(),
				deptMapping.get(option));
		credentialServiceImpl.showCredentials(e1, email);
		scanner.close();
	}

}
