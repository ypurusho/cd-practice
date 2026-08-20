package arrays_practice;

public class Palindrome {

	public static void main(String[] args) {
		int number = 9009;
		String str = String.valueOf(number);
		boolean result = isPalindrome(str);
		System.out.println(result);
		
	}

	private static boolean isPalindrome(String str) {
	
		for (int i = 0; i < str.length(); i++) {
			int left = 0, right = str.length()-1;
			while(left < right) {
				if(str.charAt(left) != str.charAt(right)) {
					return false;
				}else {
					left++;
					right--;
				}
			}
		}
		return true;
	}
}
