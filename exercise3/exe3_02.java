package exercise3;

import java.util.*;

public class exe3_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A : ");
		int a = stdIn.nextInt();
		System.out.print("정수 B : ");
		int b = stdIn.nextInt();
		stdIn.close();
		if (a % b == 0)
			System.out.println("B는 A의 약수입니다.");
	}
}