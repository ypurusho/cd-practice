package arrays_practice;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {2,1,5,3,2};
		int target = 5;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				System.out.println(i);
				break;
			}
		}
	}
}
