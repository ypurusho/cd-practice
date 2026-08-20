package strings_programming;

public class MoveZerosToEndPointer {

	public static void main(String[] args) {
		String str = "32400121200";
		char[] chars = str.toCharArray();
		int left =0;
		for(int i = 0; i<chars.length; i++) {
			if(chars[i] !=0) {
				char temp = chars[left];
				chars[left] = chars[i];
				chars[i] = temp;
				left++;
			}
			
		}
		System.out.println(new String(chars));
	}
}
