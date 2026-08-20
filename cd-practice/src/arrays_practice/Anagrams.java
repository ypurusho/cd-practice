package arrays_practice;

public class Anagrams {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		System.out.println("are " + str1 + " and " + str2 + " anagrams " + isAnagramCounting(str1, str2));
	}

	private static boolean isAnagramCounting(String str1, String str2) {
		int[] count = new int[256];
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i = 0; i<str1.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}
}
