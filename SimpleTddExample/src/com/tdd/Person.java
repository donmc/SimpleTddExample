package com.tdd;

public class Person {

	private String firstName;
	private String lastName;
	private String middleName;

	private Gender gender;

	public Person(String firstName, String lastName, String middleName, Gender gender) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
	}

	public String getFormalName() {
		String formalName = null;

		if (gender.equals(Gender.Male)) {
			formalName += "Mr. ";
		} else {
			formalName += "Mrs.";
		}
		
		return formalName + firstName + " " + middleName + " " + lastName;
	}

}
