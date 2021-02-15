package scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		String A;
		int B;
		double C;
		String D,E;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		A = sc.next();
		System.out.print("정수 입력 : ");
		B = sc.nextInt();
		System.out.print("실수 입력 : ");
		C = sc.nextDouble();
		System.out.print("문장 입력 : ");
		D = sc.nextLine();
		E = sc.nextLine();
		
		System.out.println(A+" "+B+" "+C);
		System.out.println(E);
		
	}

}
