package arrays_practice;

public class MoveZerosToEnd {

	//two pointers o(n) and o(1) 
	public static void main(String[] args) {
		int[] arr = {1,0,8,5,0,3,0,4,0,3};
		moveZerosToEnd(arr);
	}

	private static void moveZerosToEnd(int[] arr) {
		//count to 
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		for(int num : arr) {
			System.out.print(num);
		}
	}
}
