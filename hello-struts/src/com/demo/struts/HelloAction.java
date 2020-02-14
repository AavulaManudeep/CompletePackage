/**
 * 
 */
package com.demo.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author manu
 *
 */
@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {
	/*
	 * public String execute() { return SUCCESS; }
	 */
	private String username;
	private String password;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{
		if(getPassword().equals("nikonD3200")&&getUsername().equals("Manudeep"))
		{
			System.out.println(getPassword()+""+getUsername());
		return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

}
