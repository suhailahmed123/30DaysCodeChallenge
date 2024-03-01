package com.challenge;

import java.util.Scanner;

public class Day1 {

	static void code1(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("FULLSTACK");
		} else if (n % 3 == 0) {
			System.out.println("TAP");
		} else if (n % 5 == 0) {
			System.out.println("ACAD");
		}
		else {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		code1(n);
	}

}
