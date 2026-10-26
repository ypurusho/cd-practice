package arrays_practice;

public class FindSecondHighestElemet {

	public static void main(String[] args) {
		int[] arr = {2,4,6,9,3,2,10};
		int num = findSecondHighestElement(arr);
		System.out.println(num);
	}

	private static int findSecondHighestElement(int[] arr) {
		int firstMax = arr[0];
		int secondMax = arr[1];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]>firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}else if(arr[i]<firstMax && arr[i]>secondMax) {
				secondMax = arr[i];
			}
		}
		
		return secondMax;
	}
}
