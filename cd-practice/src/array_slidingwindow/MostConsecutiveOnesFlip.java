package array_slidingwindow;

public class MostConsecutiveOnesFlip {

	public static void main(String[] args) {
		//int arr[] =  {1,1,1,0,0,0,1,1,1,1,0};
		int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}; int k = 3;
		//int k = 2;
		int result = findMostCosecutiveOnesWithKflip(arr, k);
		System.out.println(result);
	}

	private static int findMostCosecutiveOnesWithKflip(int[] arr, int k) {
		int zeroCount = 0;
		int left = 0;
		int right;
		for(right = 0; right < arr.length; right++) {
			if(arr[right] == 0) {
				zeroCount++;
			}
			
			if(zeroCount > k) {
				if(arr[left] == 0) {
					zeroCount--;
				}
				left++;
			}
			
		}
		return right-left;
	}
}
