package strings_programming;

import java.util.HashMap;
import java.util.Map;

public class A2B3C3D4 {

	public static void main(String[] args) {
		String input = "aabbcccdddd";
		//output = a2b2c3d4
		//find repeatation of each character
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			builder.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(builder);
	}
}
