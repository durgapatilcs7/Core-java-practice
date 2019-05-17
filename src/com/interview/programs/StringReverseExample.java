package com.interview.programs;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StringReverseExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String str = "Durga is a software Developer";

		System.out.println("Original String: " + str);

		// Using Stringbuffer

		StringBuffer buffer = new StringBuffer(str);
		String reverseStr = buffer.reverse().toString();

		System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

		// reverse method in string

		reverseStr = reverse(str);
		System.out.println("Reverse String in Java using Iteration: " + reverseStr);

		// recursive method to reverse String in Java
		reverseStr = reverseRecursively(str);

		System.out.println("Reverse String in Java using Recursion: " + reverseStr);

	}

	private static String reverseRecursively(String str) {

		if(str.length() < 2) {
			return str;
		}
		
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	
	}

	private static String reverse(String str) {

	StringBuilder builder = new StringBuilder();
		
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			builder.append(strChars[i]);
		}
		return builder.toString();
		
	}

}
