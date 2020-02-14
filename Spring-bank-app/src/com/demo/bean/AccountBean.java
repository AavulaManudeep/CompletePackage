/**
 * 
 */
package com.demo.bean;

/**
 * @author manu
 *
 */
public class AccountBean 
{
	private String name;
	private double balance;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 */
	public AccountBean() {
		
	}
	public AccountBean(String name,double balance) {
		super();
		this.name=name;
		this.balance=balance;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountBean [name=" + name + ", balance=" + balance + "]";
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
		
	}
}
