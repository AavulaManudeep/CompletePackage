package com.accountdetails;

public interface Banks {
	
	String BankName(String name);
	Accountstype getAccountstype(String account,double amount);
	Loantypes getLoanstypes(String name,double amount);

}
