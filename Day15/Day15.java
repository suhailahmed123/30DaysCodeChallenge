package com.challenge;

import java.util.Scanner;

public class Day15 {

	static void uniqueElements(int[] a) {
		int count = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else {
				if (count == 1) {
					System.out.println(a[i]);
				}
				count = 1;
			}
		}
		if (count == 1) {
			System.out.println(a[a.length - 1]);
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		uniqueElements(a);

	}

}
