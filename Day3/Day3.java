package com.challenge;

import java.util.Scanner;

public class Day3 {

	static String isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return "Not Prime";
			}
		}
		return "Prime";
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println(isPrime(n));

	}

}
