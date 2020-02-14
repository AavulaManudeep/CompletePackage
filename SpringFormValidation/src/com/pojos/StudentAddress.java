/**
 * 
 */
package com.pojos;

/**
 * @author manu
 *
 */
public class StudentAddress {
	
	private String street;
	
	private String county;
	
	private String city;
	
	private String state;
	
	private long zipcode;
	
	/**
	 * 
	 */
	public StudentAddress() {
		super();
	}

	/**
	 * @param street
	 * @param county
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public StudentAddress(String street, String county, String city, String state, long zipcode) {
		super();
		this.street = street;
		this.county = county;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public long getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentAddress [street=" + street + ", county=" + county + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}

	
	
	
	

}
