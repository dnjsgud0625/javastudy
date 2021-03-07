package overloading;

class cal{
	int left,right;
	int mid=0;
	
	public void set(int left, int right) {
		//System.out.println("set(int left, int right)");
		this.left = left;
		this.right = right;
	}
	public void set(int left, int mid, int right) {
		this.set(left, right);
		//System.out.println("set(int left, int mid, int right)");
		this.mid = mid;
	}
	public void sum() {
		System.out.println(this.left+this.mid+this.right);
	}
}  

public class overloadingdemo1 {

	public static void main(String[] args) {
		cal c1 = new cal();
		c1.set(10, 20);
		c1.sum();
		c1.set(10, 20, 30);
		c1.sum();
	}
}