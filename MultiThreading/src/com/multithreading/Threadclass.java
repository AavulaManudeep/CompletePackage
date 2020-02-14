package com.multithreading;

public class Threadclass implements Runnable{

	@Override
	public void run() {
		System.out.println("Doing MultiThreading using Runnable Interface--START "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			
			doDBprocessing();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing MultiThreading using Runnable Interface--END "+Thread.currentThread().getName());

	}
	private void doDBprocessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	

}
