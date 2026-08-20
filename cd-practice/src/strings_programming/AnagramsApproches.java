package strings_programming;

import java.util.Arrays;

public class AnagramsApproches {

	public static void main(String[] args) {
		String str = "listen";
		String st = "silent";
		
		if(str.length() != st.length()) {
			System.out.println("given strings are not anagrams");
		}else {
			//by converting to arrays and sorting
			char[] array = str.toCharArray();
			char[] arr = st.toCharArray();
			
			Arrays.sort(array);
			Arrays.sort(arr);
			
			if(Arrays.equals(array, arr))
				System.out.println("given strings are anagrams");
			else
				System.out.println("given strings are not anagrams");
		}
		
		// using character range
		boolean flag = checkAnagrams(str, st);
		if(flag)
			System.out.println("given strings are anagrams");
		else
			System.out.println("given strings are not anagrams");
	}

	private static boolean checkAnagrams(String str, String st) {
		int count[] = new int [256];
		for(int i = 0; i<str.length() ; i++) {
			count[str.charAt(i)]++;
			count[st.charAt(i)]--;
		}
		for(int i = 0; i<256; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
