package inheritance;

class Calculator{
	int left,right;
	
	public void setop(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class subableCalculator extends Calculator{
	public void substract() {
		System.out.println(this.left-this.right);
	}
}

public class inheridemo1 {

	public static void main(String[] args) {
		
		subableCalculator c1 = new subableCalculator();
		c1.setop(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
