import java.util.Scanner;

public class AnotherSolution {
  
  public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
    System.out.println((n%15==0) ? " FULLSTACK" : ((n%3==0) ? "TAP" :((n%5==0) ? "ACAD" :n)));
	}

}

  
