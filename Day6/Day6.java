package com.challenge;

import java.util.Scanner;

public class Day6 {

	static void hcf(int n1, int n2) {
		int hcf = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n2 % i == 0 && n1 % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF: "+hcf);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		hcf(n1, n2);

	}

}
