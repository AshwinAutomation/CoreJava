package com.oop.encapsulationtest;

//import org.testng.annotations.Test;

import com.oop.encapsulation.BankAccount;

/**
 * @author Aswani.Mahakul
 * CreateAccount class 
 */
public class BankAccountLogin {
	/**
	 * Access data member to the outer class via setter and getter method due to encapsulation
	 */
	//@Test
	public void createAccount() {
		BankAccount account=new BankAccount();
		account.setBankName("HDFC Bangalore");
		account.setAccountHolderName("Ashwin Mahakul");
		account.setBankAccountNumber(319859580);
		account.setBalance(2000);
		account.getBankName();
		account.getAccountHolderName();
		account.getBankAccountNumber();
		account.getBalance();
	}
	
}
