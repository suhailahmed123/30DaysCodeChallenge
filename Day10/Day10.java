package com.challenge;

import java.util.Scanner;

public class Day10 {

	static int elementOccurrence(int n, int a[], int element) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.print("Element to Count: ");
		int element = scan.nextInt();
		
		int elementOccurrence = elementOccurrence(n, a, element);
		System.out.println("Occurrences: " + elementOccurrence);
	}

}
