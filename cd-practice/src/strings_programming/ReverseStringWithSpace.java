package strings_programming;

public class ReverseStringWithSpace {

	public static void main(String[] args) {
		String str = "hello good morning everyone";
		String newString = "";
		//spit string by space
		String[] strArr = str.split(" ");
		
		for (int i = 0; i < strArr.length; i++) {
			String strA = strArr[i];
			newString = strA + String.join(";",newString);
		}
		System.out.println(newString);
	}
}
