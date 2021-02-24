package cal2;

class Calculator{
	static int base = 0;
	int left, right;
	
	public void numset(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
}

public class demo2 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.numset(10,20);
		c1.sum();
		
		Calculator c2 = new Calculator();
		c2.numset(20,40);
		c2.sum();
		
		Calculator.base = 10;
		
		c1.sum();
		c2.sum();

	}
}
