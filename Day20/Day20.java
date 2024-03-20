package com.challenge;

import java.util.Scanner;

public class Day20 {

	static String palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return "Not Palindrome";
			}
			i++;
			j--;
		}
		return "Palindrome";
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		String res = palindrome(s);
		System.out.println(res);
	}

}
