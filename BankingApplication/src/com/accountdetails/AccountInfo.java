/**
 * 
 */
package com.accountdetails;

/**
 * @author manu
 *
 */
public class AccountInfo {
	private boolean checking=false;
	private boolean savings=true;
	/**
	 * @return the checking
	 */
	public boolean isChecking() {
		return checking;
	}
	/**
	 * 
	 */
	public AccountInfo() {
		super();
	}
	/**
	 * @param checking
	 * @param savings
	 */
	public AccountInfo(boolean checking, boolean savings) {
		super();
		this.checking = checking;
		this.savings = savings;
	}
	/**
	 * @param checking the checking to set
	 */
	public void setChecking(boolean checking) {
		this.checking = checking;
	}
	/**
	 * @return the savings
	 */
	public boolean isSavings() {
		return savings;
	}
	/**
	 * @param savings the savings to set
	 */
	public void setSavings(boolean savings) {
		this.savings = savings;
	}

}
