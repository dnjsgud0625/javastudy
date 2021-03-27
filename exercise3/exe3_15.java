package exercise3;

import java.util.*;

public class exe3_15 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		stdIn.close();

		if (a > b) {
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println(b);
			System.out.println(a);
		}
	}
}