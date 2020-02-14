/**
 * 
 */
package com.list;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author manu
 *
 */
public class ListGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World....!");
		Set<Integer> list = new HashSet();
		list.add(22);
		list.add(223340);
		list.add(2);
	
		
		for(Integer list2 : list)
		{
			System.out.println(list2);
		}
		int x =2;
		int y =8;
		int p= x>y ? x++:++y;
		System.out.println(p);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name1","Manu");
		map.put("Name2","Sai");
		map.put("Name3","Gavi");
		System.out.println(map.get("Name3"));
		Set<String> keySet = map.keySet();
		for(String ke :keySet)
		{
			System.out.println(map.get(ke));
		}
	}

}
