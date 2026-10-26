package arrays_practice;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		System.out.println("the max profit is " + findMaxProfit(arr));
	}

	private static int findMaxProfit(int[] arr) {
		 
		//start buy price at beginning
		int buyPrice = arr[0];
		//assume profit is zero 
		int profit = 0;
		
		for(int i = 1; i < arr.length; i++) {
			//if buy price is lesser than current price update the buy price
			if(arr[i] < buyPrice) {
				buyPrice = arr[i];
			}else {
				//calculate the current profit
				int currentProfit = arr[i] - buyPrice;
				//compare the profit and update maxProfit so far
				profit = Math.max(currentProfit, profit);
			}
		}
		return profit;
	}
}
