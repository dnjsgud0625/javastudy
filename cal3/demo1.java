package cal3;

class Calculator{
	
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
}

public class demo1 {

	public static void main(String[] args) {
		
		Calculator.sum(10,20);
		Calculator.avg(10,20);
		
		Calculator.sum(20,40);
		Calculator.avg(20,40);
	}
}
