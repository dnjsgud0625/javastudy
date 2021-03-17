package abs;
abstract class A {
	public abstract int b();
	public void d() {
		System.out.println("hi");
	}
}

class B extends A{
	public int b() {
		return 3;
	}
}

public class abstractdemo1 {

	public static void main(String[] args) {
		B obj = new B();
		obj.b();
	}
}