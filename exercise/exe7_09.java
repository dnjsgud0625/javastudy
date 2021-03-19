package exercise;

import java.util.*;

public class exe7_09 {
	static int readPlusInt(int n) {
		return n;
	}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		while(true) {
			System.out.print("양의 정숫값 : ");
			int n = num.nextInt();
			if(n<=0)	readPlusInt(n);
			else {
				readPlusInt(n);
				break;
			}
		}
		num.close();
	}
}