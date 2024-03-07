package com.challenge;

import java.util.Scanner;

public class Day7 {

	static String isPalindrome(int n) {
		int rev = 0, temp =n;
		while (n != 0) {
			int rem = n % 10;
			rev = rem + rev * 10;
			n = n / 10;
		}
		if (rev == temp) {
			return "Palindrome";
		} else {
			return "Not Palindrome";
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String res = isPalindrome(n);
		System.out.println(res);
	}

}
