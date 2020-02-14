/**
 * 
 */
package com.multithreading;

/**
 * @author manu
 *
 */
public class MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Threadclass(),"Thread-1");
		Thread t2 = new Thread(new Threadclass(),"Thread-2");
		Thread t3 = new Thread(new Threadclass(),"Thread-3");
		System.out.println("Start threads running");
		t1.start();
		//t2.start();
		t3.start();
		System.out.println("End of threads running");
//		Thread t1 = new ThreadExdtents("Thread-1");
//		Thread t2 = new ThreadExdtents("Thread-2");
//		t1.start();
//		t2.start();
//	

	}

}
