package exercise2;

import java.util.*;

public class exe2_05 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("x의 값 : ");
		double x = num.nextDouble();
		System.out.print("y의 값 : ");
		double y = num.nextDouble();
		num.close();
		System.out.println("합계는 " + (x + y) + "입니다.");
		System.out.println("평균은 " + (x + y) / 2 + "입니다.");
	}
}