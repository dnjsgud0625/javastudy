package overloading;
public class overloadingdemo2 {

	void A() {System.out.println("void A()");}
	void A(int a) {System.out.println("void A(int a)");}
	void A(String a) {System.out.println("void A(Sting a)");}
	//int A() {System.out.println("void A()");} 오류 발생
	
	public static void main(String[] args) {
		overloadingdemo2 od = new overloadingdemo2();
		od.A();
		od.A(7);
		od.A("hi");
	}
}