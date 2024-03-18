package com.challenge;

import java.util.Scanner;

public class Day18 {

	static void longestSubArray(int[] ar, int m) {
		for (int i = ar.length - 1; i >= 0; i--) {
			for (int j = 0; j <= ar.length - i; j++) {
				int sum = 0;
				for (int k = j; k < i + j; k++) {
					sum = sum + ar[k];
				}
				if (sum == m) {
					for (int k = j; k < i + j; k++) {
						System.out.print(ar[k] + " ");
					}
					System.out.println();
					return;
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		longestSubArray(ar, m);
	}

}
