package exercise7;

import java.util.*;

public class exe7_03 {
	static int med(int a, int b, int c) {
		int med = 0;
		med = (a>=b)?((a>=c)?((b>=c)?b:c):a):((b>=c)?((a>=c)?a:c):b);
		return med;
	}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("세 정수 입력 : ");
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		num.close();
		System.out.println("med : " + med(a, b, c));
	}
}