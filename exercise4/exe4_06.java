package exercise4;

import java.util.*;

public class exe4_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("몇 개의 *를 표시합니까? : ");
		int n = stdIn.nextInt();
		stdIn.close();

		int i = 1;
		while (i <= n) {
			System.out.print("*");
			i++;
		}
		if (i > 0)
			System.out.println();
	}
}