package exercise4;

import java.util.*;

public class exe4_05 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("카운트 다운을 합니다.");
		int x;
		do {
			System.out.print("양의 정숫값 : ");
			x = stdIn.nextInt();
		} while (x <= 0);
		stdIn.close();
		
		while (x >= 0) {
			System.out.println(++x);
		}
	}
}