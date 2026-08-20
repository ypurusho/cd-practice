package arrays_practice;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int arr[] = {1,2,0,3,0,0,6};
		moveZerosToEnd(arr);
	}

	private static void moveZerosToEnd(int[] arr) {
		int windowStart = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[windowStart];
				arr[windowStart] = arr[i];
				arr[i] = temp;
				windowStart++;	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
