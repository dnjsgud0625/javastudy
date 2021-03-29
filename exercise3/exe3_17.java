package exercise3;

import java.util.*;

public class exe3_17 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(3);
		
		if (a == 0) {
			System.out.println("가위");
		} else if (a == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
	}
}