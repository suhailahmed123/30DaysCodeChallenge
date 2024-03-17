package com.challenge;

import java.util.Scanner;

public class Day16 {

	static void printAllSubarrays(int[] a) {
		System.out.println("Sub Arrays: ");
		for (int size = 0; size < a.length; size++) {
			for (int i = size; i < a.length; i++) {
				System.out.print("[");
				for (int j = size; j <= i; j++) {
					System.out.print(a[j]);
					if (j < i) {
						System.out.print(",");
					}
				}
				System.out.print("]");
				System.out.println();
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

		printAllSubarrays(a);

	}

}
