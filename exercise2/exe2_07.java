package exercise2;

import java.util.*;

public class exe2_07 {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(9) + 1;
		int y = rand.nextInt((-1)-(-9)+1) + (-9);
		int z = rand.nextInt(90) + 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}