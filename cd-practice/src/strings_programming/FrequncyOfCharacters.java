package strings_programming;

import java.util.HashMap;
import java.util.Map;

public class FrequncyOfCharacters {

	public static void main(String[] args) {
		String str = "hello world";
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ')
				map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
}
