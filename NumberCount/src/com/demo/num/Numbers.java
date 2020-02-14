/**
 * 
 */
package com.demo.num;

import java.util.HashMap;
import java.util.Map;

/**
 * @author manu
 *
 */
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		map.put("five",5);
		map.put("six",6);
		map.put("seven",7);
		map.put("eight",8);
		map.put("nine",9);
		map.put("ten",10);
		map.put("eleven",11);
		map.put("twelve",12);
		map.put("thrteen",13);
		map.put("forteen",14);
		map.put("fifteen",15);
		map.put("sixteen",16);
		map.put("seventeen",17);
		map.put("eighteen",18);
		map.put("ninteen",19);
		map.put("twenty",20);
		map.put("thirty",30);
		map.put("fourty",40);
		map.put("fifty",50);
		map.put("sixty",60);
		map.put("seventy",70);
		map.put("eighty",80);
		map.put("ninty",90);
		map.put("hundred",100);
		map.put("zero",0);
		map.put("thousand",1000);
		map.put("lakhs",1000*1000);
		map.put("zero",0);
		String phrase = "two lakhs two thousand";
		String delims = "[ ]+";
		int number=0;
		String[] tokens = phrase.split(delims);
		int i=0;
		for(String num:tokens)
		{
			if(map.get(num)>99)
			{
				if(number>map.get(num))
				{
					number+=map.get(tokens[i-1])*map.get(num);
				}
				else 
				{
					number=map.get(tokens[i-1])*map.get(num);
				}	
			}
			else 
			{
				number+=map.get(num);
			}
			i++;
		}
		System.out.println(number);
		System.out.println(3%4);

	}

}
