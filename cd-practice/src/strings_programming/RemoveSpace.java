package strings_programming;

import java.util.Iterator;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = " Java is a robust programming language ";
		String[] st = str.trim().split("\\s+");
		for(int i = 0; i < st.length; i++) {
			System.out.print(st[i]);
		}
	}
}
