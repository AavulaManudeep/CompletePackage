/**
 * 
 */
package com.mpcoll;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.itemsinfo.Iteminfo;

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
		Map<Integer, Iteminfo> menu = new TreeMap();
		menu.put(1, new Iteminfo("Chiken Curry","Meat",50.0));
		menu.put(2, new Iteminfo("Chiken Biryani","Meat",45.0));
		menu.put(3, new Iteminfo("Chiken Keema","Meat",65.0));
		menu.put(4, new Iteminfo("Paneer","Veg",25.0));
		Set out  = menu.entrySet();
		Iterator itr = out.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		

	}

}
