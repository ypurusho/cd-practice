package array_slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class FruitsIntoBasket {

	public static void main(String[] args) {
		//int arr[] = {1,2,1};
		//int arr[] = {0,1,2,2};
		int arr[] = {1,2,1,1,3,4,2,2,2,2,4};
		int result = findCountOfFruitsInBaskets(arr);
		System.out.println(result);
	}

	private static int findCountOfFruitsInBaskets(int[] fruits) {
		int max = 0;
		int left = 0;
		HashMap<Integer, Integer> basket = new HashMap<Integer, Integer>();
		for(int right = 0; right<fruits.length; right++) {
			//try to add fruit into basket 
			int currentCount = basket.getOrDefault(fruits[right], 0);
			basket.put(fruits[right], currentCount+1);
			
			//if basket has more than two different types
			//remove the fruits initially added for which we already counted.
			while(basket.size()>2) {
				int count = basket.get(fruits[left]); 
				//completely remove fruit
				if(count == 1) {
					basket.remove(fruits[left]);
				}else {// decrement the count until fruit is removed completely
					basket.put(fruits[left], count-1);
				}
			  left++;
			}
			//keep track of maximum count so far
			max = Math.max(max, right - left + 1);
		}
		return max;
	}
}
