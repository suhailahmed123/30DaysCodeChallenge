package com.challenge;

import java.util.Scanner;

public class Day5 {

	static void yCommonMultiples(int n1, int n2, int y) {
		int count = 1;
		for (int i = 1; count <= y; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.print(i +" ");
				count++;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		yCommonMultiples(n1, n2, y);
	}

}
