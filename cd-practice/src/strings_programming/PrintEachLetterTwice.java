package strings_programming;

import java.util.Scanner;

public class PrintEachLetterTwice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String str = sc.nextLine();
		if(str == null || str.isEmpty()) {
			System.out.println("your input is empty or invalid");
		}
		System.out.println("result : " + printTwice(str));
	}

	private static String printTwice(String str) {
		char[] cha = str.toCharArray();
		//StringBuilder result = "";
		StringBuilder builder = new StringBuilder();
		for(char ch : cha) {
			builder.append(ch).append(ch);
		}
		return builder.toString();
	}
}
