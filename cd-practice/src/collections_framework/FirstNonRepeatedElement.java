package collections_framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {
		String str = "swiss";
		Map<Character,Integer> map = new LinkedHashMap<>();

		for(char c : str.toCharArray()) {
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for(var e : map.entrySet()) {
		    if(e.getValue() == 1) {
		        System.out.println(e.getKey());
		        break;
		    }
		}
	}
}
