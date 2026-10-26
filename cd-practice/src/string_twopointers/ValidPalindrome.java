package string_twopointers;

public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(checkValidPalindrome(str));
	}

	private static boolean checkValidPalindrome(String str) {
		//remove extra spaces and any special characters
		str = str.replaceAll("[^a-zA-z]", "").toLowerCase();
		System.out.println(str);
		char[] ch = str.toCharArray();
		int left = 0, right = str.length()-1;
		while(left<right) {
			if(ch[left] != ch[right])
				return false;
			left++;
			right--;
		}
		return true;
	}
}
