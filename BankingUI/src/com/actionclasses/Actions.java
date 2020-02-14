/**
 * 
 */
package com.actionclasses;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author manu
 *
 */
//@SuppressWarnings("serial")
public class Actions extends ActionSupport {
	/**
	 * @return the username
	 */
	/*
	 * public String getUsername() { return username; }
	 * 
	 * 
	 *//**
		 * @param username the username to set
		 */
	/*
	 * public void setUsername(String username) { this.username = username; }
	 * 
	 * 
	 *//**
		 * @return the pass
		 */
	/*
	 * public String getPass() { return pass; }
	 * 
	 * 
	 *//**
		 * @param pass the pass to set
		 */
	/*
	 * public void setPass(String pass) { this.pass = pass; }
	 * 
	 * 
	 *//**
		 * @return the cpass
		 */
	/*
	 * public String getCpass() { return cpass; }
	 * 
	 * 
	 *//**
		 * @param cpass the cpass to set
		 */
	/*
	 * public void setCpass(String cpass) { this.cpass = cpass; }
	 * 
	 * 
	 *//**
		 * @return the email
		 */
	/*
	 * public String getEmail() { return email; }
	 * 
	 * 
	 *//**
		 * @param email the email to set
		 */
	/*
	 * public void setEmail(String email) { this.email = email; }
	 * 
	 * 
	 *//**
		 * @return the phone
		 */
	/*
	 * public String getPhone() { return phone; }
	 * 
	 * 
	 *//**
		 * @param phone the phone to set
		 */
	/*
	 * public void setPhone(String phone) { this.phone = phone; }
	 * 
	 * 
	 *//**
		 * @return the address
		 */
	/*
	 * public String getAddress() { return address; }
	 * 
	 * 
	 *//**
		 * @param address the address to set
		 */
	/*
	 * public void setAddress(String address) { this.address = address; }
	 * 
	 * 
	 *//**
		 * @return the zipcode
		 */
	/*
	 * public String getZipcode() { return zipcode; }
	 * 
	 * 
	 *//**
		 * @param zipcode the zipcode to set
		 */
	/*
	 * public void setZipcode(String zipcode) { this.zipcode = zipcode; }
	 * 
	 * 
	 *//**
		 * @return the register
		 */
	/*
	 * public String getRegister() { return register; }
	 * 
	 * 
	 *//**
		 * @param register the register to set
		 */
	/*
	 * public void setRegister(String register) { this.register = register; }
	 * 
	 * 
	 *//**
		 * @return the signin
		 */
	/*
	 * public String getSignin() { return signin; }
	 * 
	 * 
	 *//**
		 * @param signin the signin to set
		 */
	/*
	 * public void setSignin(String signin) { this.signin = signin; }
	 * 
	 * 
	 *//**
		 * @return the usertype
		 */
	/*
	 * public String getUsertype() { return usertype; }
	 * 
	 * 
	 *//**
		 * @param usertype the usertype to set
		 */
	/*
	 * public void setUsertype(String usertype) { this.usertype = usertype; }
	 * 
	 * 
	 *//**
		 * @return the accounttype
		 */
	/*
	 * public ArrayList<String> getAccounttype() { return accounttype; }
	 * 
	 * 
	 *//**
		 * @param accounttype the accounttype to set
		 */
	/*
	 * public void setAccounttype(ArrayList<String> accounttype) { this.accounttype
	 * = accounttype; }
	 * 
	 * 
	 *//**
		 * @return the susername
		 */
	/*
	 * public String getSusername() { return susername; }
	 * 
	 * 
	 *//**
		 * @param susername the susername to set
		 */
	/*
	 * public void setSusername(String susername) { this.susername = susername; }
	 * 
	 * 
	 *//**
		 * @return the spass
		 */
	/*
	 * public String getSpass() { return spass; }
	 * 
	 * 
	 *//**
		 * @param spass the spass to set
		 */
	/*
	 * public void setSpass(String spass) { this.spass = spass; }
	 * 
	 * 
	 *//**
		 * @return the susertype
		 */
	/*
	 * public String getSusertype() { return susertype; }
	 * 
	 * 
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 * 
	 * @Override public String toString() { return "Actions [username=" + username +
	 * ", pass=" + pass + ", cpass=" + cpass + ", email=" + email + ", phone=" +
	 * phone + ", address=" + address + ", zipcode=" + zipcode + ", register=" +
	 * register + ", signin=" + signin + ", usertype=" + usertype + ", accounttype="
	 * + accounttype + ", susername=" + susername + ", spass=" + spass +
	 * ", susertype=" + susertype + "]"; }
	 * 
	 * 
	 *//**
		 * @param susertype the susertype to set
		 *//*
			 * public void setSusertype(String susertype) { this.susertype = susertype; }
			 * private String username; private String pass; private String cpass; private
			 * String email; private String phone; private String address; private String
			 * zipcode; private String register; private String signin; private String
			 * usertype; private ArrayList<String> accounttype;
			 */
	private String susername;
	private String spass;
	private String susertype;

	/**
	 * @return the susername
	 */
	public String getSusername() {
		return susername;
	}



	/**
	 * @param susername the susername to set
	 */
	public void setSusername(String susername) {
		this.susername = susername;
	}



	/**
	 * @return the spass
	 */
	public String getSpass() {
		return spass;
	}



	/**
	 * @param spass the spass to set
	 */
	public void setSpass(String spass) {
		this.spass = spass;
	}



	/**
	 * @return the susertype
	 */
	public String getSusertype() {
		return susertype;
	}



	/**
	 * @param susertype the susertype to set
	 */
	public void setSusertype(String susertype) {
		this.susertype = susertype;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Actions [susername=" + susername + ", spass=" + spass + ", susertype=" + susertype + "]";
	}



	public void validate() {

		System.out.println("REgister value:" + toString());

			;
			if (susername == null || susername.trim().equals("")) {
				addFieldError("susername", "username cannot be empty");
			}
			if (spass == null || spass.trim().equals("")) {
				addFieldError("spass", "username cannot be empty");

			}

			if (susertype == null) {
				addFieldError("susertype", "username cannot be empty");

			}

		}

	

	/*
	 * System.out.println("REgister value:"+toString()); if( register!=null) { if
	 * (username==null|| username.trim().equals("")) { addFieldError(username,
	 * "username cannot be empty");
	 * 
	 * } if (password==null|| password.trim().equals("")) { addFieldError(password,
	 * "username cannot be empty");
	 * 
	 * } if (cpassword!=password||cpassword.trim().equals("")||cpassword==null) {
	 * addFieldError(cpassword, "username cannot be empty");
	 * 
	 * } if (usertype!="Admin"||usertype!="Customer") { addFieldError(usertype,
	 * "username cannot be empty");
	 * 
	 * } if (accounttype.size()<=0) { addFieldError(usertype,
	 * "username cannot be empty");
	 * 
	 * } } else if(signin.equals("SignIn"))
	 * 
	 * { System.out.println(signin); if (susername==null||
	 * susername.trim().equals("")) { addFieldError(susername,
	 * "username cannot be empty");
	 * 
	 * } if (spassword==null||spassword.trim().equals("")) {
	 * addFieldError(spassword, "username cannot be empty");
	 * 
	 * } if (susertype!="Admin"||susertype!="Customer") { addFieldError(susertype,
	 * "username cannot be empty");
	 * 
	 * } }
	 */

	public String execute() {
		System.out.println("In exicution");
		return SUCCESS;
	}

}
