package string_twopointers;

public class ValidPalindromeII {

	public static void main(String[] args) {
		String str = "abbca";
		System.out.println(checkValidPalindrome(str));
	}

	private static boolean checkValidPalindrome(String str) {
		int left = 0, right = str.length()-1;
		while(left<right) {
			//if character or not same then remove at most one and check
			if(str.charAt(left) != str.charAt(right)) {
				return check(str, left + 1, right) ||
						check(str, left, right -1);
			}
			left++;
			right--;
		}
		return true;
	}

	private static boolean check(String str, int left, int right) {
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
