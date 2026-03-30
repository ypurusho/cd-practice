package strings_programming;

public class CheckNumberOrString {

	public static void main(String[] args) {
		String str = "HelloWorld123";
		//using streams
		boolean isNumber = str.chars().anyMatch(Character::isDigit);
		if(isNumber) {
			System.out.println("Given string contains numbers");
		}else
			System.out.println("Given stirng does not contain any numbers");
	}
}
