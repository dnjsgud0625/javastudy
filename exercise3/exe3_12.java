package exercise3;

import java.util.*;

public class exe3_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a : ");
		int a = stdIn.nextInt();
		System.out.print("b : ");
		int b = stdIn.nextInt();
		System.out.print("c : ");
		int c = stdIn.nextInt();
		stdIn.close();

		int min = a;

		if (a > b)
			min = b;
		if (b > c)
			min = c;

		System.out.println("min : " + min);
	}
}