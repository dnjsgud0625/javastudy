package repetitive;

public class continuestatement {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5)	continue;
			System.out.println("I want to stop when i=5 " + i);
		}
	}
}