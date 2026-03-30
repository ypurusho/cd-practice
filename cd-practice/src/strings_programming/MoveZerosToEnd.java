package strings_programming;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		String str = "32400121200";
		//traverse and count the zeros, if not then append using string builder and add the zeros based on count
		StringBuilder builder = new StringBuilder();
		int count = 0;
		char[] ch = str.toCharArray();
		for(char c : ch) {
			if(c == '0') {
				count++;
			}else {
				builder.append(c);
			}
		}
		if(count > 0) {
			for(int i = 1; i <= count; i++) {
				builder.append('0');
			}
		}
		System.out.println(builder);
	}
}
