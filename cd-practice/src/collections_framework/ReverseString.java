package collections_framework;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Apple";
		String newStr = "";
		char ch;
//		for (int i = str.length()-1; i > -1; i--) {
//			newStr = newStr + str.charAt(i);
//		}
		for(int i = 0; i < str.length(); i++) {
			System.out.println("i : " + i);
			ch = str.charAt(i);
			System.out.println("ch : "+ ch);
			newStr = ch + newStr;
			System.out.println("newStr : " + newStr);
		}
		System.out.println(newStr);
	}
}
