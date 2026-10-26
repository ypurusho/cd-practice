package array_slidingwindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

	public static void main(String[] args) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int[] result = findMaxSlidingWindow(arr, k);
		System.out.println(Arrays.toString(result));
	}

	private static int[] findMaxSlidingWindow(int[] arr, int k) {
		int[] result = new int[arr.length -k +1];
		//que to store the indexs of arr
		//first side store max num. descending order
		Deque<Integer> deque = new LinkedList<>();
		for(int i = 0; i<arr.length; i++) {
			//compare the last inserted num index in que is smaller than current number in arr
			while(!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
				//removes last inserted number until above condition fails
				deque.pollLast();
			}
			//checks if the first number in que is moving out of current window size
			while(!deque.isEmpty() && deque.peekFirst() <= i - k) {
				//removes first inserted number as window moves forward
				deque.pollFirst();
			}
			// adds num into que 
			deque.addLast(i);
			//condition for add only if current i reach k size example if k = 3 index 0,1 will be skipped and at 2 window size reached
			//then so far max number in window will be added into result
			if(i >= k-1) {
				//adding the max number in window at the index position stored in que
				result[i-k+1] = arr[deque.peekFirst()];
			}
		}
		return result;
	}
}
