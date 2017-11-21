/**
 * @author Susanne och Erica
 * @version 1.0
 * 
 * This is our Main class
 */

package com.assignment_4.main;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

public class Main {
	
	/**
	 * Här börjar main metod som plockar upp information från de andra klasser och interface
	 * @param args
	 */
	public static void main(String[] args) {
		String account = "";

		BankCustomer bc = new BankCustomer("Susanne", 51);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());

		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("\nDepositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());

		System.out.println("\nWithdrawing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());

		System.out.println("\nDepositing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.toString());
		bankAccount.depositMoney(200.0);

		PersonalAccount pa = new PersonalAccount();
		pa.depositMoney(70);
		System.out.println(pa.toString());
		pa.depositMoney(-1);

		SavingAccount sa = new SavingAccount();
		sa.withdrawMoney(-20);
		sa.withdrawMoney(20);
		System.out.println(sa.toString());

	}

}
