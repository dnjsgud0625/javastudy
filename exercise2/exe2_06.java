package exercise2;

import java.util.*;

public class exe2_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("삼각형 면적을 구합니다.");
		System.out.print("밑변 : ");
		double x = stdIn.nextDouble();
		System.out.print("높이 : ");
		double y = stdIn.nextDouble();
		stdIn.close();
		System.out.println("면적은 : " + (x * y) / 2 + "입니다.");
	}
}