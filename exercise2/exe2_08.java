package exercise2;

import java.util.*;

public class exe2_08 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int x = stdIn.nextInt();
		stdIn.close();
		System.out.println("이 값의 +-5의 난수를 생성했습니다.");
		int y = rand.nextInt(11) - 5;
		System.out.print("생성한 난수는 " + (x + y) + "입니다.");
	}
}