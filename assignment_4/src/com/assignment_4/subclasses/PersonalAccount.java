/**
 * @author Susanne och Erica
 * @version 1.0
 * 
 * This is our sub class to the super class BankAccount.
 * Here we use a method that generates a random account number
 * This class is also instantiated as accountType Personal Account.
 */

package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

public class PersonalAccount extends BankAccount{
	public PersonalAccount() {
		this.setAccountNumber( UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("Personal Account");
	}

}