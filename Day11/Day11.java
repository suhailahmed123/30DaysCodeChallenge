package com.challenge;

import java.util.Scanner;

public class Day11 {

	static void printAllPairs(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] != a[j]) {
					System.out.println("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Pairs:");
		printAllPairs(a);
	}

}
