package exercise2;

import java.util.*;

public class exe2_09 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double x = rand.nextDouble();
		double y = rand.nextDouble()*10;
		double z = rand.nextDouble()*100;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}