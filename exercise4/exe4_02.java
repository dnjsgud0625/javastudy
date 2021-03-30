package exercise4;

import java.util.*;

public class exe4_02 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int a = rand.nextInt(90) + 10;
		int x;

		do {
			System.out.print("정수값 입력 : ");
			x = stdIn.nextInt();
		} while (a != x);
		stdIn.close();
	}
}