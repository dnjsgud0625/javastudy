package exercise2;

import java.util.*;

public class exe2_04 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int x = num.nextInt();
		num.close();
		System.out.println("10을 더한 값은 " + (x + 10) + "입니다.");
		System.out.println("10을 뺀 값은 " + (x - 10) + "입니다.");
	}
}