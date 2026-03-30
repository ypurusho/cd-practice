package strings_programming;

public class PrintEvenIndexed {

	public static void main(String[] args) {
		String str = "apple";
		char[] arr = str.toCharArray();
		
		for (int i = 2; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		//loops only for even indexed
		for (int i = 2; i < arr.length; i += 2) {
//			if(i % 2 == 0) {
				System.out.println(arr[i]);
//			}
		}
	}
}
