
package exercise3;

import java.util.*;

public class exe3_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		stdIn.close();
		
		int min = 0, max = 0;

		if (a != b) {
			if (a > b) {
				max = a;
				min = b;
			} else if (a < b) {
				max = b;
				min = a;
			}
			System.out.println("값이 작은 쪽은 " + min + "입니다.");
			System.out.println("값이 큰 쪽은 " + max + "입니다.");
		} else {
			System.out.println("두 값은 같습니다.");
		}
	}
}