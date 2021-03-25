package exercise3;

import java.util.*;

public class exe3_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정숫값 : ");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("이 값은 양수입니다.");
		else if (n < 0)
			System.out.println("이 값은 음수입니다.");
		else if (n == 0)
			System.out.println("이 값은 0입니다.");
		stdIn.close();
	}
}