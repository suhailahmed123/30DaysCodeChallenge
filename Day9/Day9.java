package com.challenge;

import java.util.Scanner;

public class Day9 {
	static int largestElement(int n, int a[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		int largestElement = largestElement(n, a);
		System.out.println(largestElement);
	}

}
