package com.challenge;

import java.util.Scanner;

public class Day17 {

	static void subarraysSum(int[] array, int k) {
		int sum = 0;
		System.out.println("Subarrays with Sum 10: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				for (int l = 0; l <= j; l++) {
					sum = sum + array[l];
					if (sum == k) {
						System.out.println(array[l] + " ");
					}
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
		int k = scan.nextInt();
		subarraysSum(a, k);

	}

}
