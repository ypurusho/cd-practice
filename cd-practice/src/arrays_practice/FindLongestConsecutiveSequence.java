package arrays_practice;

import java.util.HashSet;
import java.util.Set;

public class FindLongestConsecutiveSequence {

	//hashset o(n)time and o(n) space
	//copy all elements into set
	//find starting element of sequence by checking the current element - 1 is present or not in set
	//if present skip else increment element and length by 1 and check if next number present in set or not
	public static void main(String[] args) {
		int arr[] = {2, 6, 1, 9, 4, 5, 3};
		System.out.println("longest consective sequence is " + findLongestConsecutiveSequnce(arr));
	}
	
	private static int findLongestConsecutiveSequnce(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int maxLength = 0;
		for(int element : arr) {
			set.add(element);
		}
		for(int num : arr) {
			//start of a sequence 2-1 = 1
			if(!set.contains(num-1)) {
				int currentNum = num;
				int currentLength = 1;
				// Then check for next elements in the sequence
				while(set.contains(currentNum+1)) {
					currentNum++;
					currentLength++;
				}
				//update the max length
				maxLength = Math.max(maxLength, currentLength);
			}
		}
		
		return maxLength;
	}
}

