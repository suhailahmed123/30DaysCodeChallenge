package com.challenge;

import java.util.Scanner;

public class Day8 {
	static int sumArray(int n, int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int sumArray = sumArray(n, a);
		System.out.println(sumArray);
	}

}
