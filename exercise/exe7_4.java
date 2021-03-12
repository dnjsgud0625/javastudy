package exercise;

import java.util.*;

public class exe7_4 {
	static int sumUp(int a) {
		if(a==1)	return 1;
		else {
			int total=0;
			for(int i=0;i<=a;i++)	total+=i;
			return total;
		}
	}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
		int a = num.nextInt();
		num.close();
		System.out.println("1부터 "+a+"까지의 합 : "+sumUp(a));
	}
}