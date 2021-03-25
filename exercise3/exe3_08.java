package exercise3;

import java.util.*;

public class exe3_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("점수 : ");
		int a = stdIn.nextInt();
		stdIn.close();
		
		if (a >= 0 && a < 60)
			System.out.println("낙제");
		else if (a >= 60 && a < 70)
			System.out.println("보통");
		else if (a >= 70 && a < 80)
			System.out.println("양호");
		else
			System.out.println("우수");
	}
}