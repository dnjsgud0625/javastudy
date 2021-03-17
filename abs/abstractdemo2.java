package abs;
abstract class calculator{
	int left, right;
	public void setop(int left, int right) {
		this.left = left;
		this.right = right;
	}
	int _sum() {
		return this.left+this.right;
	}
	int _avg() {
		return _sum()/2;
	}
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}

class calcudecoplus extends calculator{
	public void sum() {
		System.out.println("+++++"+_sum()+"+++++");
	}
	public void avg() {
		System.out.println("+++++"+_avg()+"+++++");
	}
}

class calcudecomina extends calculator{
	public void sum() {
		System.out.println("-----"+_sum()+"-----");
	}
	public void avg() {
		System.out.println("-----"+_avg()+"-----");
	}
}
public class abstractdemo2 {

	public static void main(String[] args) {
		calcudecoplus c1 = new calcudecoplus();
		c1.setop(10, 20);
		c1.run();

		calcudecomina c2 = new calcudecomina();
		c2.setop(10, 20);
		c2.run();
	}
}