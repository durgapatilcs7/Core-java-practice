package com.learn.java8;

public class LambdaRunnableExample {

	public static void main(String[] args) {
 
		/**
		 * Prior java 8
		 */
//	   Runnable runnable=new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Inside Runnable 1");	
//			}
//		};
//		
//		new Thread(runnable).start();
		
		/**
		 * 
		 * java 8 using lambda
		 */
		Runnable rannableLambda = ()-> System.out.println("Inside Runnable 1");
		new Thread(rannableLambda).start();
		
 }
	
}
