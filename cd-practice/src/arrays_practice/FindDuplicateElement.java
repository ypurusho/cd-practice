package arrays_practice;

public class FindDuplicateElement {

	//Flyod's cycle detection
	//array size = n + 1 and values from 1 to n
	//exactly only once a number is duplicated
	public static void main(String[] args) {	
		int[] nums = {1, 3, 4, 2, 2};
		printDuplicateNumber(nums);
	}

	private static void printDuplicateNumber(int[] nums) {
		//start a fast and slow pointer until they meet
		int slow = nums[0];
		int fast = nums[0];
		
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}while(slow != fast);
		
		slow = nums[0];
		// as soon as they meet, move both pointer at same speed until they meet again
		while(fast != slow) {
			slow = nums[slow];
			fast = nums[fast];
		}
		
		System.out.println("duplicate number is " + slow);
		System.out.println(fast);
	}
}
