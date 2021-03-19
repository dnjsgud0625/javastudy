package exercise;

import java.util.*;

public class exe7_08 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("변수의 범위 입력");
		System.out.print("a : ");
		int a = num.nextInt();
		System.out.print("b : ");
		int b = num.nextInt();
		num.close();
		
		int n = rand.nextInt(b-a+1)+a;
		System.out.print("a이상 b미만의 난수 : "+n);
	}
}