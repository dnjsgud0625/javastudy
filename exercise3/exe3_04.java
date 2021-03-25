package exercise3;

import java.util.*;

public class exe3_04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a : ");
		int a = stdIn.nextInt();
		System.out.print("b : ");
		int b = stdIn.nextInt();
		stdIn.close();
		if (a > b)
			System.out.println("a가 큽니다.");
		else if (a < b)
			System.out.println("b가 큽니다.");
		else
			System.out.println("a와 b가 같은 값입니다.");
	}
}