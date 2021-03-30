package exercise4;

import java.util.*;

public class exe4_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 A : ");
		int a = stdIn.nextInt();
		System.out.print("정수 B : ");
		int b = stdIn.nextInt();

		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = b; i <= a; i++) {
				System.out.print(i + " ");
			}
		}
	}
}