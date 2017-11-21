/**
 * @author Susanne och Erica
 * @version 1.0
 * 
 * This is our  two super classes BankAccount. Subclasses are PersonalAccount and SaingAccount.
 * The Interface class BankOperations is connected to it.
 */


package com.assignment_4.superclasses;

import java.util.UUID;
import com.assignment_4.interfaces.*;

public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0.0;
	}

	/**
	 * Här kommer getters and setter till attributen accountNumber, accountType och balance
	 * @return accountNumber
	 * @return accountType
	 * @return balance
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * I toString används getters för att hämta värdena.
	 */
	@Override
	public String toString() {
		return "\nBankAccount [Account Number= " + getAccountNumber() + ",  Balance= " + getBalance()
				+ ",  Account Type= " + getAccountType() + "]";
	}

	/**
	 * Här kommer två if..else satser för withdrawMoney och depositMoney.
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative value!");
		}
	}

	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a negative value!");
		}
	}

}
