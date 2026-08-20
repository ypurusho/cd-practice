package arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int array[] = {2,4,7,29,8,10,6,5};
		int target = 11;
		
		int result = findIndexofTarget(array, target);
		if(result != -1) {
			System.out.println("target " + target + " is at " + result + "th position");
		}else {
			System.out.println("given target is not found in array");
		}
		
	}

	private static int findIndexofTarget(int[] array, int target) {
		//linear for unsorted array o(n)
				for(int i = 0; i< array.length; i++) {
					if(array[i] == target) {
						return i;
					}
				}
				return -1;
	}
}
