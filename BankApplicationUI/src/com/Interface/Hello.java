/**
 * 
 */
package com.Interface;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author manu
 *
 */
public class Hello extends ActionSupport{
	
	private String username;
	private String password;
	private String usertype;
	private ArrayList<String> accounttype; 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public ArrayList<String> getAccounttype()
			{ return accounttype; }
	public void setAccounttype(ArrayList<String> accounttype) 
	{ 
		this.accounttype = accounttype;
	}

	/*
	 * 
	 * 
	 * public void setAccounttype(ArrayList<String> accounttype) { this.accounttype
	 * = accounttype; }
	 * 
	 * public String generator() { accounttype = new ArrayList<String>();
	 * accounttype.add("Savings"); accounttype.add("Checking"); return "generator";
	 * }
	 */
	
	public String Usertype()
	{
		if(usertype.equals("Admin")&&username.equals("Manudeep")&&password.equals("nikonD3200"))
			return "admin";
		else if(usertype.equals("Customer")&&username.equals("sai")&&password.equals("nikonD3200"))
			return "customer";	
		else
			return INPUT;
	}
	public String Customer()
	{
		 if(accounttype.size()>0)
		 { 
			 return SUCCESS;
		}
		 else
			 return INPUT;
	}
	public String execute()
	{
		/*
		 * if(accounttype.size()>1) { return SUCCESS; }
		 * 
		 * return ERROR;
		 */
		System.out.println("In the execute");
		if(usertype.equals("Admin")&&username.equals("Manudeep")&&password.equals("nikonD3200"))
			return "admin";
		else if(usertype.equals("Customer")&&username.equals("sai")&&password.equals("nikonD3200"))
			return "customer";	
		else
			return INPUT;	
		
	}
	public void validate()
	{
		if(username==null||username.trim().equals("")||usertype==null)
		{
			addFieldError("username","User cannot be empty");
		}
		if(password==null||password.trim().equals("")||usertype==null)
		{
			addFieldError("password","Passwors cannot be empty");
		}
		if(usertype.equals("Admin")&&username.equals("sai")&&password.equals("nikonD3200"))
		{
			addFieldError("usertype","Usertype is Not valid");
		}
		if(usertype.equals("Customer")&&username.equals("Manudeep")&&password.equals("nikonD3200"))
		{
			addFieldError("usertype","Usertype is Not valid");
		}
	}
	

}
