/**
 * 
 */
package com.factories;

import com.accountdetails.Banks;
import com.accountholder.BankofAmerica;
import com.accountholder.CitiBank;
import com.accountholder.Regions;

/**
 * @author manu
 *
 */
public class BankFactory {

	public Banks getBanks(String bankname)
	{
		if (bankname.equals(null)) {
			return null;
			
		} else if (bankname.equalsIgnoreCase("BankofAmerica")) 
		{
			return new BankofAmerica();
		} else if (bankname.equalsIgnoreCase("CitiBank")) {
			return new CitiBank();
		} else if (bankname.equalsIgnoreCase("Regions")) {
			return new Regions();
		}  else {
			return null;	
		}
	}
	
}
