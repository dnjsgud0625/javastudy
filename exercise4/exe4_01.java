package exercise4;

import java.util.*;

public class exe4_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while (true) {
			System.out.print("정숫값 : ");
			int a = stdIn.nextInt();

			if (a > 0) {
				System.out.println("양수입니다.");
			} else if (a < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("0입니다.");
			}
		}
	}
}