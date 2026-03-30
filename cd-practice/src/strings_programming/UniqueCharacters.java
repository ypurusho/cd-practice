package strings_programming;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "ssdd";
		Map<Character, Integer> map = new HashMap<>();
		
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char key = chars[i];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		//System.out.println(map);
		//map.entrySet().stream().filter(item -> item.getValue() == 1).forEach(item -> System.out.print(item.getKey()));
		boolean found = false;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey());
				found = true;
			}
		}
		if(!found) {
			System.out.println("no unique characters found");
		}
	}
}
