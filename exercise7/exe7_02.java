package exercise7;

import java.util.*;

public class exe7_02 {
	static int min(int a, int b, int c) {
		int max = 0;
		max = ((a>=b)&&(a>=c)?a:((b>=c)&&(b>=c))?b:c);
		return max;
	}
	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("세 정수 입력 : ");
		int a = num.nextInt();
		int b = num.nextInt();
		int c = num.nextInt();
		num.close();
		System.out.println("max : " + min(a,b,c));
	}
}