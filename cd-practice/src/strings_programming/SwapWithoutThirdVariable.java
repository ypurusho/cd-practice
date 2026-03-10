package strings_programming;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		String strA = "good";
		String strB = "morning";
		System.out.println("before swap strA : " + strA + ", strB : " + strB);
		//concat both string and assing to strA
		strA = strA + strB;
		System.out.println("str A : " + strA);
		
		//extract strB from concated strA
		System.out.println(strA.length() - strB.length());
		strB = strA.substring(0, strA.length() - strB.length());
		
		//extract strA from concated strA
		strA = strA.substring(strB.length());
		
		System.out.println("after swap strA : " + strA + ", strB : " + strB);
		
		
	}
}
