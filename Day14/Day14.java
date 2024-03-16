package com.challenge;

import java.util.Scanner;

public class Day14 {

	static void printOccurrencesOfAllElements(int a[]) {

		int count = 1;
		System.out.println("Occurrences: ");
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else {
				System.out.println(a[i] + " - " + count);
				count = 1;
			}
		}
		System.out.println(a[a.length - 1] + " - " + count);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		printOccurrencesOfAllElements(a);
	}

}
