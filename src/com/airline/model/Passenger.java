package com.airline.model;

import java.util.Date;

import com.airline.dictionary.Gender;

/**
 * Class represents a Passenger model
 * 
 * @author JuanMarcos
 *
 */
public class Passenger {

	//Properties
	private String firstName;
	private String lastName;
	private Date datOfBirth;
	private Gender gender;
	
	//Constructors
	public Passenger() {
	}
	
	public Passenger(String firstName, String lastName, Date datOfBirth, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.datOfBirth = datOfBirth;
		this.gender = gender;
	}

	//Accessors
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getDatOfBirth() {
		return datOfBirth;
	}
	
	public void setDatOfBirth(Date datOfBirth) {
		this.datOfBirth = datOfBirth;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	//To string
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", datOfBirth=" + datOfBirth
				+ ", gender=" + gender + "]";
	}
	
	
}
