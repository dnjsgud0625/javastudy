package exercise3;

import java.util.*;

public class exe3_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫값 : ");
		int a = stdIn.nextInt();
		stdIn.close();
		if (a >= 0)
			System.out.println("절댓값은 " + a + "입니다.");
		else
			System.out.println("절댓값은 " + (a * (-1)) + "입니다.");
	}
}