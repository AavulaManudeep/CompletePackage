/**
 * 
 */
package com.accountholder;

//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

/**
 * @author manu
 *
 */
public class AccountHolder {
	
	private String name;
	private long account_number;
	private long balance;
	private long withdral;
	private Address address;
	/**
	 * @param name
	 * @param account_number
	 * @param balance
	 * @param withdral
	 * @param address
	 */
	public AccountHolder(String name, long account_number, long balance, long withdral, Address address) {
		super();
		this.name = name;
		this.account_number = account_number;
		this.balance = balance;
		this.withdral = withdral;
		this.address = address;
	}
	/**
	 * 
	 */
	public AccountHolder() {
		super();
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the account_number
	 */
	public long getAccount_number() {
		return account_number;
	}
	/**
	 * @param account_number the account_number to set
	 */
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	/**
	 * @return the balance
	 */
	public long getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}
	/**
	 * @return the withdral
	 */
	public long getWithdral() {
		return withdral;
	}
	/**
	 * @param withdral the withdral to set
	 */
	public void setWithdral(long withdral) {
		this.withdral = withdral;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountHolder [name=" + name + ", account_number=" + account_number + ", balance=" + balance
				+ ", withdral=" + withdral + ", address=" + address + "]";
	}
	
}
