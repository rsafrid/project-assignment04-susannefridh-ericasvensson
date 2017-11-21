/**
 * @author Susanne och Erica
 * @version 1.0
 * 
 * This is our sub class to super class Human.
 */

package com.assignment_4.subclasses;

import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccount = new ArrayList<BankAccount>();

	public BankCustomer(String name, int age) {
		super(name, age);

	}

	/**
	 * 
	 * Här ligger en ArrayList kopplad till BankAccount
	 * @return customerAccount
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccount;
	}

	/**
	 * Här kommer getters and setter till attributet customerAccount
	 * @param customerAccounts
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccount = customerAccounts;
	}

	public void addAccount(BankAccount bankAccount) {
		this.customerAccount.add(bankAccount);
	}

	/**
	 * Här kommer två for loopar med en if sats depositToAccount och withdrawFromAccount.
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).depositMoney(amount);
			}
		}
	}

	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).withdrawMoney(amount);
			}
		}
	}

	/**
	 * I toString används getters för att hämta värdena för namn och ålder.
	 */
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < customerAccount.size(); i++) {
			s += customerAccount.get(i);
		}
		return "Customer: " + getName() + ", ålder: " + getAge() + s;
	}

}
