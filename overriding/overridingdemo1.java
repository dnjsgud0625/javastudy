package overriding;

class cal{
	int left, right;
	
	public cal() {}
	public cal(int left, int right) {
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
class subcal extends cal{
	public subcal(int left,int right) {
		super(left,right);
	}	
	public void sum() {
		System.out.println("실행결과는 " + (this.left+this.right)+"입니다.");
	}
	public void sub() {
		System.out.println(this.left-this.right);
	}
}
public class overridingdemo1 {

	public static void main(String[] args) {
		subcal c1 = new subcal(10,20);
		c1.sum();
		c1.avg();
		c1.sub();
	}
}