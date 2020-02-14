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

public class RegistrationAction extends ActionSupport{

	private String username;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the cpass
	 */
	public String getCpass() {
		return cpass;
	}
	/**
	 * @param cpass the cpass to set
	 */
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the accounttype
	 */
	public ArrayList<String> getAccounttype() {
		return accounttype;
	}
	/**
	 * @param accounttype the accounttype to set
	 */
	public void setAccounttype(ArrayList<String> accounttype) {
		this.accounttype = accounttype;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegistrationAction [username=" + username + ", pass=" + pass + ", cpass=" + cpass + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", zipcode=" + zipcode + ", accounttype=" + accounttype
				+ "]";
	}
	private String pass;
	private String cpass;
	private String email;
	private String phone;
	private String address;
	private String zipcode;
	private ArrayList<String> accounttype;
	private String usertype;
	/**
	 * @return the usertype
	 */
	public String getUsertype() {
		return usertype;
	}
	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public void validate()
	{
		 System.out.println("REgister value:"+toString());
		
		  if(username==null|| username.trim().equals("")) {
		  addFieldError("username","username cannot be empty");
		  
		  } if(pass==null|| pass.trim().equals("")) {
		  addFieldError("pass","username cannot be empty");
		  
		  } 
		  
		  if (usertype==null) { addFieldError("usertype","username cannot be empty");
		  
		  } if (accounttype.size()<=0) {
		  addFieldError("usertype","username cannot be empty"); }
		  
		 
			  
	}
	
	public String execute()
	{
		return SUCCESS;
	}
}
