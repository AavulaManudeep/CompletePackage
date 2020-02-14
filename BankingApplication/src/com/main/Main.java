/**
 * 
 */
package com.main;

import com.accountdetails.Accountstype;
import com.accountdetails.Banks;
import com.accountdetails.Loantypes;
import com.factories.BankFactory;

/**
 * @author manu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory bankFactory = new BankFactory();
		Banks bank = bankFactory.getBanks("bankofamerica");
		Accountstype accountstype = bank.getAccountstype("Savings", 1000);
		Loantypes loantypes = bank.getLoanstypes("StudentLoan", 1000);
		System.out.println("Get Bank you have acount is :"+ bank.BankName("Bank of America"));
		System.out.println("Account type you have :"+accountstype.currentbalance());
		System.out.println("Loan you need to pay :"+loantypes.checkloan());
	}

}
