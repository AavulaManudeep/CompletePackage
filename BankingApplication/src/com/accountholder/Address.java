/**
 * 
 */
package com.accountholder;

/**
 * @author manu
 *
 */
public class Address {
private String Stree;
/**
 * @return the stree
 */
public String getStree() {
	return Stree;
}
/**
 * @param stree the stree to set
 */
public void setStree(String stree) {
	Stree = stree;
}
/**
 * @return the zipcode
 */
public int getZipcode() {
	return zipcode;
}
/**
 * 
 */
public Address() {
	super();
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Address [Stree=" + Stree + ", zipcode=" + zipcode + "]";
}
/**
 * @param stree
 * @param zipcode
 */
public Address(String stree, int zipcode) {
	super();
	Stree = stree;
	this.zipcode = zipcode;
}
/**
 * @param zipcode the zipcode to set
 */
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
private int zipcode;

}
