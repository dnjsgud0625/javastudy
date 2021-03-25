package exercise3;

import java.util.*;

public class exe3_09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a : ");
		int a = stdIn.nextInt();
		System.out.print("b : ");
		int b = stdIn.nextInt();
		stdIn.close();
		
		int max = a>b?a:b;
		
		System.out.println("max : "+max);
	}
}