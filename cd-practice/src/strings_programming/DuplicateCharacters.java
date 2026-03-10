package strings_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "firstsecondthirdfourth";
//		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(str.charAt(i), map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		System.out.println(list);
	}
}
