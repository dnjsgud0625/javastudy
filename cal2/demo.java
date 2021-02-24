package cal2;

class Calculate{
	static double PI = 3.14;
	int left, right;
	
}

public class demo {

	public static void main(String[] args) {
		
		Calculate c1 = new Calculate();
		System.out.println(c1.PI);
		
		Calculate c2 = new Calculate();
		System.out.println(c2.PI);
		
		System.out.println(Calculate.PI);
	}
}