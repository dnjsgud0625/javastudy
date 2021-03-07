package overloading;

public class overloadingdemo3 extends overloadingdemo2{
	void A(String A, String B) {System.out.println("sub class void A(String A, String B)");}
	void A() {System.out.println("sub class void A()");}
	
	public static void main(String[] args) {
		overloadingdemo3 od = new overloadingdemo3();
		od.A();
		od.A(1);
		od.A("hi");
		od.A("hi", "hi2");
	}
}