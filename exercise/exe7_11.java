package exercise;

import java.util.*;

public class exe7_11 {
	static void printBits(int x) {
		for(int i=31; i>=0; i--) {
			System.out.print(((x>>>i & 1)==1)? '1':'0');
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 : ");
		int x = stdIn.nextInt();
		stdIn.close();
		
		System.out.print("정수 : ");	printBits(x);
		System.out.print("\n좌시프트 : ");	printBits(x<<1);
		System.out.print("\n"+x*2+"의 값 : ");	printBits(x*2);
		System.out.print("\n우시프트 : ");	printBits(x>>1);
		System.out.print("\n"+x/2+"의 값 : ");	printBits(x/2);
	}
}