/**
 * 
 */
package com.accountholder;

import com.accountdetails.Accountstype;
import com.accountdetails.Banks;
import com.accountdetails.Loantypes;
import com.factories.AccountFactory;
import com.factories.LoanFactory;

/**
 * @author manu
 *
 */
public class Regions implements Banks{

	@Override
	public String BankName(String name) {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Accountstype getAccountstype(String account,double amount) {
		// TODO Auto-generated method stub
		AccountFactory accountFactory = new AccountFactory();
		
		return accountFactory.getAccounttype(account,amount );
	}

	@Override
	public Loantypes getLoanstypes(String name,double amount) {
		// TODO Auto-generated method stub
		LoanFactory loanFactory = new LoanFactory();

		return loanFactory.getLoantypes(name, amount);
	}

}
