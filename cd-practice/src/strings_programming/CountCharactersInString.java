package strings_programming;

public class CountCharactersInString {
 
	public static void main(String[] args) {
		String str = "Advanced java programming.";
		System.out.println(str.length());
		char[] ch = str.toCharArray();
		int count = 0;
		for(char c : ch) {
			if(c != ' ' && c != '.') {
				count ++;
			}
		}
		System.out.println(count);
	}
}
