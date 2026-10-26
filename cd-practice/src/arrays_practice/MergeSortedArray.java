package arrays_practice;

public class MergeSortedArray {

	//two pointers 
	public static void main(String[] args) {
		int arr1[] = {1,3,5,7};
		int arr2[] = {2,4,6,8};
		int arr[] = mergeTwoSortedArrays(arr1, arr2);
		if(arr != null && arr.length >1) {
			for(int num : arr) {
				System.out.print(num);
			}
		}
	}
	
	private static int[] mergeTwoSortedArrays(int arr1[], int arr2[]) {
		
		int i = 0;// pointer for arr1 
		int j = 0;// pointer for arr2 
		int k = 0;// pointer for result
		int n = arr1.length;
		int m = arr2.length;
		int[] result = new int [n + m];
		
		while(i < n && j < m) {
			if(arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			}else {
				result[k++] = arr2[j++];
			}
		}
		//copy remaining elements in arr1
		while(i < n) {
			result[k++] = arr1[i++];
		}
		//copy remaining elements in arr2
		while(j < m) {
			result[k++] = arr2[j++];
		}
		
		return result;
	}
}
