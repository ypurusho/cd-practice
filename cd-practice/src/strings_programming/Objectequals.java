package strings_programming;

public class Objectequals {

	public static void main(String[] args) {
		Integer a = 128;
		Integer b = 128;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		String s = "hello";
		s.concat("world");
		System.out.println("s after concat : " + s);
		String str = "hello";
		System.out.println(s == str);
		System.out.println(s.equals(str));
		
		String s1 = new String("hello");
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
	}
}
