/**
 * 
 */
package com.factories;

import com.accountdetails.Car;
import com.accountdetails.Loantypes;
import com.accountdetails.Mortgage;
import com.accountdetails.PersonalLoan;
import com.accountdetails.StudentLoans;

/**
 * @author manu
 *
 */
public class LoanFactory 
{

		public Loantypes getLoantypes(String type, double amount) {
			
			if (type.equals(null)) {
				return null;
				
			} else if (type.equalsIgnoreCase("car")) 
			{
				return new Car(amount);
			} else if (type.equalsIgnoreCase("StudentLoan")) {
				return new StudentLoans(amount);
			} else if (type.equalsIgnoreCase("Mortgage")) {
				return new Mortgage(amount);
			} else if(type.equalsIgnoreCase("PersonalLoan")) {
				return new PersonalLoan(amount);
			} else {
				return null;	
			}
		}
}
