package exercise;

import java.util.*;

public class exe7_10 {
	static Scanner num = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("다시 한번? <Yes-1/No-0> : ");
			cont = num.nextInt();
		}while(cont != 0 && cont != 1);
		return cont ==1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("암산 트레이닝 !!");
		do {
			int x = rand.nextInt(999)+100;
			int y = rand.nextInt(999)+100;
			int z = rand.nextInt(999)+100;
			int a = rand.nextInt(4)+1;
			
			if(a==1) {
				while(true) {
					System.out.print(x+" + "+y+" + "+z+" = ");
					int k = num.nextInt();
					if(k==x+y+z)	break;
					System.out.println("틀렸습니다!!");
					}
			}
			if(a==2) {
				while(true) {
					System.out.print(x+" + "+y+" - "+z+" = ");
					int k = num.nextInt();
					if(k==x+y-z)	break;
					System.out.println("틀렸습니다!!");
					}
			}
			if(a==3) {
				while(true) {
					System.out.print(x+" - "+y+" + "+z+" = ");
					int k = num.nextInt();
					if(k==x-y+z)	break;
					System.out.println("틀렸습니다!!");
					}
			}
			if(a==4) {
				while(true) {
					System.out.print(x+" - "+y+" - "+z+" = ");
					int k = num.nextInt();
					if(k==x-y-z)	break;
					System.out.println("틀렸습니다!!");
					}
			}
		}while(confirmRetry());
	}
}