package exercise;

import java.util.*;

public class exe7_07 {
	static void pucChars(char c, int n) {
		while(n-- > 0)	System.out.print(c);
	}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("몇 단 : ");
		int a = num.nextInt();
		num.close();
		
		for(int i=0;i<=a;i++) {
			pucChars('+',i);
			System.out.println();
		}
	}
}