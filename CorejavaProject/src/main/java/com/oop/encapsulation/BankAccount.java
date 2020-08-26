package com.oop.encapsulation;

/*
 * @author Aswani.Mahakul
 * @date 10.8.19
 * @version java 1.8
 * @category-> Encapsulation
 * @serial Encapsulation:It is a process of create a class wrapping or binding
 *         with all variables and methods in a single unit called encapsulation.
 *         Why Encapsulation? By developing encapsulation we are hiding object
 *         data for direct access from the outer class members,and providing its
 *         access directly only through via setter and getter methods with
 *         proper validation.
 * @serial : What are problems will occur if encapsulation not develop in
 *         project ? 1.Loose data 2.code redundancy 3.Wrong value can store
 *         4.Anyone can access object data 5.For every changes we must modify
 *         complete project.
 * @serial :Advantages of Encapsulation. 1.By encapsulation we can achieve
 *         "security".2.Stop unauthorized people access to access to object
 *         data. 3.stop storing wrong values we can modify code without
 *         effecting other classes.
 */
public class BankAccount extends Object {

	/**
	 * String variable contains details of BankName
	 */
	private String bankName;
	/**
	 * String variable contains details of AccountHolderName
	 */
	private String accountHolderName;
	/**
	 * long variable contains BankAccountNo
	 */
	private long bankAccountNumber;
	/**
	 * double variable contains balance of respective accountholder
	 */
	private double balance;

	/**
	 * @param bankName:This method store information about bankName
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return This method return bankName
	 */

	public String getBankName() {
		System.out.println("Print bankName :" + bankName);
		return this.bankName;
	}

	/**
	 * @param accountHolderName:this method store information about
	 *        accountHolderName
	 */
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	/**
	 * @return this method return accountholdername
	 */
	public String getAccountHolderName() {
		System.out.println("Print AccountHolderName :" + accountHolderName);
		return this.accountHolderName;
	}

	/**
	 * 
	 * @param bankAccountNumber:This method store information about
	 *        BankAccountNumber
	 */
	public void setBankAccountNumber(long bankAccountNumber) {

		this.bankAccountNumber = bankAccountNumber;
	}

	/**
	 * @return : This method return BankAccountNumber
	 */
	public long getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	/**
	 * @param balance:This method store information about Balance in the respective
	 *        account holder with validation
	 */
	public void setBalance(double balance) {
		if (balance <= 0) {
			System.out.println("do not enter -ve amont ");

		} else {

			this.balance = balance;
			System.out.println("print current balance :" + balance);
		}
	}

	/**
	 * @return : This method return current balance
	 */
	public double getBalance() {
		return this.balance;
	}

}
