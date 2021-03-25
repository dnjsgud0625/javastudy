package exercise3;

import java.util.*;

public class exe3_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a : ");
		int a = stdIn.nextInt();
		System.out.print("b : ");
		int b = stdIn.nextInt();
		System.out.print("c : ");
		int c = stdIn.nextInt();
		stdIn.close();

		int mid = a >= b ? (a >= c ? (b >= c ? b : c) : a) : (a >= c ? a : (b >= c ? c : b));
		System.out.println("middle : " + mid);
	}
}
