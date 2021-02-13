package repetitive;

public class breakstatement {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5)	break;
			System.out.println("I want to stop when i=5 " + i);
		}
	}
}