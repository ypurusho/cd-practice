package arrays_practice;

public class FindMax {

	public static void main(String[] args) {
		int arr[] = {2,1,5,3,2};
		int result = findMax(arr);
		System.out.println(result);
	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		return max;
	}
}
