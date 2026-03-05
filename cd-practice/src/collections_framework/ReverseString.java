package collections_framework;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Apple";
		String newStr = "";
		for (int i = str.length()-1; i > -1; i--) {
			newStr = newStr + str.charAt(i);
		}
		System.out.println(newStr);
	}
}
