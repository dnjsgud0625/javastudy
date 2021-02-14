package array;

public class arrloop {

	public static void main(String[] args) {
		String[] arr = {"abc", "def", "ghi"};
		for(int i=0;i<arr.length; i++) {
			String alp = arr[i];
			System.out.println(alp + " -> next");
		}
		System.out.print('\n');
		String[] arr2= {"abc", "def", "ghi"};
		for(String e : arr2) {
			System.out.println(e + " -> next");
		}

	}

}
