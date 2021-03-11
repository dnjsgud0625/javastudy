package exercise;

import java.util.*;

public class exe7_1 {
	static int sign0f(int n) {
		if(n<0)	return -1;
		else if(n==0)	return 0;
		else	return 1;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sn.nextInt();
		sn.close();
		System.out.print(sign0f(a));
	}
}