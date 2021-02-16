package method;

public class method2 {

	public static void numbering(int lim) {
		int i=0;
		while(i<lim) {
			System.out.print(i+" ");
			i++;
		}
	}
	
	public static void main(String[] args) {
		 numbering(5); //호출
	}
}
