package inheritance;

class DivCal extends MultiCal {
	public void division() {
		System.out.println(this.left/this.right);
	}
}
public class inheridemo3 {

	public static void main(String[] args) {
		DivCal c1 = new DivCal();
		c1.setop(20, 10);
		c1.sum();
		c1.avg();
		c1.multiple();
		c1.division();
	}
}
