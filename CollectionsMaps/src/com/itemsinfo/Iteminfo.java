/**
 * 
 */
package com.itemsinfo;

/**
 * @author manu
 *
 */
public class Iteminfo {
	
	private String item_name;
	private String item_catogry;
	private double price;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Iteminfo [item_name=" + item_name + ", item_catogry=" + item_catogry + ", price=" + price + "]";
	}
	/**
	 * 
	 */
	public Iteminfo() {
		super();
	}
	/**
	 * @param item_name
	 * @param item_catogry
	 * @param price
	 */
	public Iteminfo(String item_name, String item_catogry, double price) {
		super();
		this.item_name = item_name;
		this.item_catogry = item_catogry;
		this.price = price;
	}
	
	/**
	 * @return the item_name
	 */
	public String getItem_name() {
		return item_name;
	}
	/**
	 * @param item_name the item_name to set
	 */
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	/**
	 * @return the item_catogry
	 */
	public String getItem_catogry() {
		return item_catogry;
	}
	/**
	 * @param item_catogry the item_catogry to set
	 */
	public void setItem_catogry(String item_catogry) {
		this.item_catogry = item_catogry;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
