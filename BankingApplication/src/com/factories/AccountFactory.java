/**
 * 
 */
package com.factories;

import com.accountdetails.Accountstype;
//import com.accountdetails.Car;
import com.accountdetails.CheckingAccount;
import com.accountdetails.SavingsAccount;
//import com.accountdetails.StudentLoans;

/**
 * @author manu
 *
 */
public class AccountFactory {
	public Accountstype getAccounttype(String name ,double amount)
	{
		if (name.equals(null))
		{
			return null;
			
		} 
		else if (name.equalsIgnoreCase("Savings")) 
		{
			return new SavingsAccount(amount);
		} 
		else if (name.equalsIgnoreCase("checking")) 
		{
			return new CheckingAccount(amount);
		} 
		else {
			return null;
		}
	}	

}
