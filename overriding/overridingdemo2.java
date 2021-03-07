package overriding;

class cal1{
	int left, right;
	
	public cal1() {}
	public cal1(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public int avg() {
		return ((this.left+this.right)/2);
	}
}
class subcal1 extends cal1{
	public subcal1(int left,int right) {
		super(left,right);
	}	
	public void sum() {
		System.out.println("실행결과는 " + (this.left+this.right)+"입니다.");
	}
	public void sub() {
		System.out.println(this.left-this.right);
	}
	public int avg() {
		return super.avg();
	}
}
public class overridingdemo2 {

	public static void main(String[] args) {
		subcal1 c1 = new subcal1(10,20);
		c1.sum();
		c1.avg();
		c1.sub();
	}
}