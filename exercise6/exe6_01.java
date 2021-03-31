package exercise6;

import java.util.*;

public class exe6_01 {

	public static void main(String[] args) {
		Random rand = new Random();
		double[] a = new double[5];

		for (int i = 0; i < 5; i++) {
			a[i] = rand.nextDouble();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}
}