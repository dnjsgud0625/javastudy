package exercise;

import java.util.*;

public class exe7_06 {
	static void printSeason(int a) {
		if(a==1 || a==2 || a==12)	System.out.println("겨울");
		else if(a==3 || a==4 || a==5)	System.out.println("봄");
		else if(a==6 || a==7 || a==8)	System.out.println("여름");
		else if(a==9 || a==10 || a==11)	System.out.println("가을");
		else System.out.println(" ");
	}

	public static void main(String[] args) {
		Scanner month = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = month.nextInt();
		month.close();
		printSeason(a);
	}
}