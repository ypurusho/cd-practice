package strings_programming;

public class SeparateNumberAndAlphabets {

	public static void main(String[] args) {
		String str = "Apple123Banana45&^";
		char[] ch = str.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder numberBuilder = new StringBuilder();
		for (char c : ch) {
			if(Character.isLetter(c)) {
				stringBuilder.append(c);
			}else if(Character.isDigit(c)) {
				numberBuilder.append(c);
			}
		}
		System.out.println(stringBuilder);
		System.out.println(numberBuilder);
	}
}
