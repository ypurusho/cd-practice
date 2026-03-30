package strings_programming;

public class Palindrome {

	public static void main(String[] args) {
		String str = "racecar";
		String reversedStr = "";
		
		
		//own implementation
		char[] chArr = str.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			reversedStr = chArr[i] + reversedStr;
		}
		if(reversedStr.equals(str)) {
			System.out.println(str + " is a palindrome");
		}else
			System.out.println(str + " is not a palindrome");
		
		//str = "racecar";
		System.out.println(isPalindrome(str));
		
	}
	
	//using two pointer
	// Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; // Null strings are not palindromes
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // No mismatches found
    }

}
