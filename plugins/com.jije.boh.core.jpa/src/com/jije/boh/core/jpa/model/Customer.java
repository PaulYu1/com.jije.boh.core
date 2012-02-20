package com.jije.boh.core.jpa.model;

import javax.persistence.*;


/**
 * JPA Sample class
 * 
 * @author Murphy
 */
@Entity
public class Customer {
	@Id
	@GeneratedValue
	int id;

	@Column(name = "LNAME")
	String lastName;

	@Column(name = "FNAME")
	String firstName;

	@Column(name = "ADDR")
	String address;

	@OneToOne
	Account account;

	/* Constructors */
	public Customer() {
		super();
	}

	public Customer(String lastName, String firstName, String address) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
	}

	/* Getters and setters */
	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String toString() {
		return "Customer(" + firstName + " " + lastName + ", " + address + ")";
	}
}
