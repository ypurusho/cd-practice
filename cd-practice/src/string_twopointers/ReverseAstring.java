package string_twopointers;

import java.util.Arrays;

public class ReverseAstring {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		int left = 0, right = str.length()-1;
		char[] ch = str.toCharArray();
		while(left<right) {
			char temp = ch[right];
			ch[right] = ch[left];
			ch[left] = temp;
			left++;
			right--;
		}
		
		return Arrays.toString(ch);
	}
}
