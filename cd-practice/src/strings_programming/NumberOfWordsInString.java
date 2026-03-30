package strings_programming;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		String str = "hello everyone good morning";
		//String[] stri = str.split(" ");
		String[] stri = str.trim().split("\\s+");
		System.out.println(stri.length);
	}
}
