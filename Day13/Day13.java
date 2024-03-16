package com.challenge;

import java.util.Scanner;

public class Day13 {
	static void largestrepeatingelement(int a[]) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				count++;
				max = a[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		largestrepeatingelement(a);

	}

}
