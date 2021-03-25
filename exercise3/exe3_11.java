package exercise3;

import java.util.*;

public class exe3_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A : ");
		int a = stdIn.nextInt();
		System.out.print("정수 B : ");
		int b = stdIn.nextInt();
		stdIn.close();

		if (a - b <= 10)
			System.out.println("두 값의 차는 10이하입니다.");
		else
			System.out.println("두 값의 차는 11이상입니다.");
	}
}