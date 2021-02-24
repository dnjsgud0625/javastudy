package cal3;

class c1{
	static int static_variable = 1;
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		//클래스 메소드는 인스턴스 변수에 접근할 수 없다.
		System.out.println(instance_variable);
	}
	void instance_static() {
		//인스턴스 메소드 클래스 변수에 접근할 수 있다.
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class demo3 {

	public static void main(String[] args) {
		c1 c = new c1();
		
		c.static_static();
		//인스턴스를 이용하여 정적 메소드에 접근 -> 성공
		//인스턴스 메소드가 정적 변수에 접근 -> 성공
		
		c.static_instance();
		//인스턴스를 이용하여 정적 메소드에 접근 -> 성공
		//인스턴스 메소드가인스턴스 변수에 접근 -> 실패
		
		c.instance_static();
		//인스턴스를 이용하여 인스턴스 메소드에 접근 -> 성공
		//인스턴스 메소드가 클래스 변수에 접근 -> 성공
		
		c.instance_instance();
		//인스턴스를 이용하여 인스턴스 메소드에 접근 -> 성공
		//인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
		
		c1.static_static();
		//클래스를 이용하여 클래스 메소드에 접근 -> 성공
		//클래스 메소드가 클래스 변수에 접근 -> 성공
		
		c1.static_instance();
		//클래스를 이용하여 클래스 메소드에 접근 -> 실패
		
		c1.instance_static();
		//클래스를 이용하여 클래스 메소드에 접근 -> 실패
		
		c1.instance_instance();
		//클래스를 이용하여 클래스 메소드에 접근 -> 실패

	}
}
