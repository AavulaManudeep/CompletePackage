/**
 * 
 */
package com.hackers;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author manu
 *
 */
public class Collection {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        Scanner in = new Scanner(System.in);
		        ArrayList<values> list = new ArrayList<values>();
		        values();
		        int t=in.nextInt();
		        //Collection qw = 
		        //Collection.test te= new Collection().new test();
		        
		        for(int i=0;i<t;i++){
		        	//System.out.print("dfsf");
		        	 Collection.values input = new Collection().new values();
		        //Values input= new Values();
		        input.a = in.nextInt();
	            input.b = in.nextInt();
	            input.n = in.nextInt();
		            list.add(input);

		        }
		        for(int i=0;i<t;i++){
		            int x=0;
		            int prev=0;
		            while(x<list.get(i).getN())
		            {
		            	//System.out.println(list.get(i).getA());
		                System.out.println(list.get(i).getA()+(prev+=list.get(i).getB()*Math.pow(2,x)));
		                x++;
		            }

		        }
		        

		        in.close();
		    }

		public static void values()
		{
			System.out.println("Inside Values");
		}
		class values
		{
			/**
			 * @return the a
			 */
			public int getA() {
				return a;
			}
			/**
			 * @param a the a to set
			 */
			public void setA(int a) {
				this.a = a;
			}
			/**
			 * @return the b
			 */
			public int getB() {
				return b;
			}
			/**
			 * @param b the b to set
			 */
			public void setB(int b) {
				this.b = b;
			}
			/**
			 * @return the n
			 */
			public int getN() {
				return n;
			}
			/**
			 * @param n the n to set
			 */
			public void setN(int n) {
				this.n = n;
			}
			public int a;
			public int b;
			public int n;
		}
	}


