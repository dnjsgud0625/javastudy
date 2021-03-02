package inheritance;

class MultiCal extends Calculator{
	public void multiple() {
		System.out.println(this.left*this.right);
	}
}

public class inheridemo2 {

	public static void main(String[] args) {
		
		MultiCal c1 = new MultiCal();
		c1.setop(10, 20);
		c1.sum();
		c1.avg();
		c1.multiple();
	}
}
