package exercise3;

import java.util.*;

public class exe3_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값 입력 : ");
		int a = stdIn.nextInt();
		stdIn.close();

		if (a >= 3 && a < 6) {
			System.out.println("봄");
		} else if (a >= 6 && a < 9) {
			System.out.println("여름");
		} else if (a >= 9 && a < 12) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
	}
}