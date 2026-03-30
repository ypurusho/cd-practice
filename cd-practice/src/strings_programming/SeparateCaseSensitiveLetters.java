package strings_programming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SeparateCaseSensitiveLetters {

	public static void main(String[] args) {
		String str = "aBADbcEDed";
		char[] ch = str.toCharArray();
		StringBuilder upperCaseBuilder = new StringBuilder();
		StringBuilder lowerCaseBuilder = new StringBuilder();
		for (char c : ch) {
			if(Character.isUpperCase(c)) {
				upperCaseBuilder.append(c);
			}else if(Character.isLowerCase(c)) {
				lowerCaseBuilder.append(c);
			}
		}
		char[] upperCase = upperCaseBuilder.toString().toCharArray();
		Arrays.sort(upperCase);
		System.out.println(upperCase);
		char[] lowerCase = lowerCaseBuilder.toString().toCharArray();
		Arrays.sort(lowerCase);
		System.out.println(lowerCase);
	}
}
