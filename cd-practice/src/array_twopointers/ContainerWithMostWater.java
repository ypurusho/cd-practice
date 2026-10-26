package array_twopointers;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int area = findMaxArea(height);
		System.out.println("max area is " + area);
	}

	private static int findMaxArea(int[] height) {
		int left = 0; int right = height.length-1;
		int maxArea = 0; 
		int width = 0;
		while(left<right) {
			int minHeight = Math.min(height[right], height[left]);
			width = right -left;
			maxArea =  Math.max(maxArea, minHeight * width);
			if(height[left]<height[right]) {
				left++;
			}else {
				right--;
			}
			
		}
		return maxArea;
	}
}
