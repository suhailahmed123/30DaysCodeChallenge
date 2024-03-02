import java.util.Scanner;

public class Day2 {

	static void factorsOfn(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		factorsOfn(n);
	}

}
