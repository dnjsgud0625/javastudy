package exercise3;

import java.util.*;

public class exe3_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		stdIn.close();

		if (a > b) {
			if (b > c) {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			} else if (c > b && a > c) {
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			} else {
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
			}
		} else {
			if (a > c) {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			} else if (c > b) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			}
		}
	}
}