package strings_programming;


import java.util.Scanner;

public class ConsonentsAndOwels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text");
		String input = sc.nextLine();
		if(input == null || input.isEmpty()) {
			System.out.println("Invalid text, Please enter correct input");
		}
		char[] chars = input.toCharArray();
		int vowelCount = 0, constCount = 0;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if(Character.isLetter(c)) {
				if(isVowel(c)) {
					vowelCount++;
				}
				else {
					constCount++;
				}
			}
		}
		System.out.println("total consonents : " + constCount);
		System.out.println("total vowels : " + vowelCount);
		sc.close();
	}

	private static boolean isVowel(char ch) {
		String vowelsSet = "aeiouAEIOU";
		if(vowelsSet.indexOf(ch) != -1) {
			return true;
		}else {
			return false;
		}
	}
}
