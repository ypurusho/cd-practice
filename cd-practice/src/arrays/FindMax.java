package arrays;

public class FindMax {

	public static void main(String[] args) {
		int[] arr = {1, 2,4,9,6,5,10,67,8};
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
