package arrays_practice;

public class TrappingWithRainWater {

	//two pointers o(n) time and o(1) space
	//Keep track of:
	//leftMax = highest bar seen from left.
	//rightMax = highest bar seen from right.
	//Move the pointer having the smaller height.
	//If current height is less than its max boundary, water can be trapped.
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println("total trapped water is " +totalWaterTarpped(height));
	}

	private static int totalWaterTarpped(int[] height) {
		int left = 0, right = height.length - 1;
		int leftMax = 0, rightMax = 0;
		int water = 0;
		while(left < right) {
			if(height[left] < height[right]) {
				leftMax = Math.max(rightMax, height[left]);
				water += leftMax - height[left];
				
				left++;
			}else {
				rightMax = Math.max(rightMax, height[right]);
				water += rightMax - height[right];

				right--;
			}
		}
		return water;
	}
}
