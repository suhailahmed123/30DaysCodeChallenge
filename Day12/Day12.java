package com.challenge;

import java.util.Scanner;

public class Day12 {

	static void pairDifferenceK(int a[], int k) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] - a[j] == k) {
					System.out.print("(" + a[i] + "," + a[j] + ")");
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
		System.out.print("Difference: ");
		int k = scan.nextInt();
		System.out.print("Pairs: ");
		pairDifferenceK(a, k);

	}

}
