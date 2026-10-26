package array_slidingwindow;

public class MostConsecutiveOnes {

	//sliding window o(n) and o(1) 
	// keep increment current count until meet 0 
	//else update max count so far with current count and reset current count to zero
	public static void main(String[] args) {
		int arr[] = {1,1,1,0,1,1,1,1};
		int result = findMostConsecutiveOnes(arr);
		System.out.println(result);
	}

	private static int findMostConsecutiveOnes(int[] arr) {
		int currentCount = 0;
		int maxCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				currentCount++;
			}else {
				maxCount = Math.max(maxCount, currentCount);
				currentCount = 0;
			}
		}
		return Math.max(maxCount, currentCount);
	}
}
