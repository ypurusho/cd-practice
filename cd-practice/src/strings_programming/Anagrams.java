package strings_programming;

public class Anagrams {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		System.out.println("are " + str1 + " and " + str2 + " anagrams " + isAnagramCounting(str1, str2));
		
	}
	
	private static int CHARACTER_RANGE= 256;

	public static boolean isAnagramCounting(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    int count[] = new int[CHARACTER_RANGE];
	    System.out.println(count.length);
	    for (int i = 0; i < string1.length(); i++) {
	    	System.out.println(string1.charAt(i));
	    	System.out.println(string2.charAt(i));
	    	System.out.println(count[i]);
	    	System.out.println("count [" + string1.charAt(i) + "] is ");
	    	System.out.println(count[string1.charAt(i)]);
	    	System.out.println(count[string2.charAt(i)]);
	        count[string1.charAt(i)]++;
	        count[string2.charAt(i)]--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	    	System.out.println(count[i]);
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
