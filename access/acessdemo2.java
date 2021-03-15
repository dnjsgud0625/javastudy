package access;

class Calculator {
	private int left, right;
	
	public void setop(int left, int right) {
		this.left = left;
		this.right = right;
	}
	private int _sum() {
		return this.left+this.right;
	}
	public void sumdecoplus() {
		System.out.println("++++"+_sum()+"++++");
	}
	public void sumdecomin() {
		System.out.println("----"+_sum()+"----");
	}
}
public class acessdemo2 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setop(10, 20);
		c1.sumdecoplus();
		c1.sumdecomin();
	}
}