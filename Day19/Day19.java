package com.challenge;

import java.util.Scanner;

public class Day19 {

	static String reverseString(String s) {

		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		String res = reverseString(s);
		System.out.println(res);

	}

}
