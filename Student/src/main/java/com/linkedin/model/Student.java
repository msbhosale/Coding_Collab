package com.linkedin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int rollnumber;
	private String firstname;
	private String lastname;
	private String emailId;

	public Student() {

	}

	public Student(int rollnumber, String firstname, String lastname, String emailId) {

		this.rollnumber = rollnumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailId = emailId;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailId=" + emailId + "]";
	}

}
