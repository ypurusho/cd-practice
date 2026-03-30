package strings_programming;

public class WithoutUpperCaseMethod {

	public static void main(String[] args) {
		String str = "hello world";
		StringBuilder builder = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			builder.append(ch);
		}
		System.out.println(builder);
	}
}
