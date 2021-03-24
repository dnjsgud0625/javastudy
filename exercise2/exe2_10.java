package exercise2;

import java.util.*;

public class exe2_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("성 : ");
		String a = stdIn.nextLine();
		System.out.print("이름 : ");
		String b = stdIn.nextLine();
		System.out.println("안녕하세요 " + (a + b) + "씨!");
		stdIn.close();
	}
}