package com.interview.programs;

import java.util.Scanner;

public class ReverseNumberExample {

	public static void main(String[] args) {
		System.out.println("Enter a number to reverse :");

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int reverse = reverse(number);

		System.out.println("Reverse of number: " + number + " is " + reverse(number));

	}

	private static int reverse(int number) {

		int reverse = 0;
		int remainder = 0;

		do {
			remainder = number % 10;

			reverse = reverse * 10 + remainder;

			number = number / 10;
		} while (number > 0);

		return reverse;
	}
}
