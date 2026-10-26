package array_twopointers;

public class TrappingRainWater {

	public static void main(String[] args) {
		//int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		int arr[] = {4,2,0,3,2,5};
		int result = findTotalWaterTrapped(arr);
		System.out.println("total water is " + result);
	}
	
	public static int findTotalWaterTrapped(int[] height) {
		int water = 0;
		//sum of water and leftMax or rightMax and difference of height
		
		int left = 0, right = height.length -1;
		int leftMax = 0, rightMax = 0;
//		for(int i = 0; i < height.length - 1; i++) {
//			if(height[i])
//		}
		while(left<right) {
			if(height[left]<height[right]) {
				leftMax = Math.max(leftMax, height[left]);
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
