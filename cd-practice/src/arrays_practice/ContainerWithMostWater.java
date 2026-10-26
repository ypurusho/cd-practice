package arrays_practice;

public class ContainerWithMostWater {

	//two pointers
	//calculate area between left and right * minimun of height between left and right
	public static void main(String[] args) {
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		printMaxArea(height);
	}

	private static void printMaxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int maxArea = 0;
		while(left < right) {
			int width = right - left;
			int minHeight = Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, minHeight*width);
			
			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println("Max Area is " + maxArea);
	}
}
