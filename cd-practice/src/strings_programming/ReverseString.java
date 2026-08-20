package strings_programming;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Apple";
		String newStr = "";
		for (int i = str.length()-1; i > -1; i--) {
			newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);
		str = "Apple";
		//using two pointer
		char[] chars = str.toCharArray();
		int left =0, right = chars.length-1;
		while(left<=right) {
			char temp = str.charAt(left);
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		System.out.println(new String(chars));
	}
}
