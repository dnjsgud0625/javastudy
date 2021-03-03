package consturctor;

class cal{
	int left, right;
	
	public cal() {}
	public cal(int left, int right) {
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class subablecal extends cal{
	public subablecal(int left, int right) {
		super(left,right);
	}
	public void sub() {
		System.out.println(this.left-this.right);
	}
}
public class condemo3 {

	public static void main(String[] args) {
		subablecal s = new subablecal(10,20);
		s.sum();
		s.avg();
		s.sub();
	}
}