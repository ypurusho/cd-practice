package collections_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapKeysValuesSort {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Suresh", "20000");
		map.put("Mahesh", "30000");
		map.put("Ramesh", "50000");
		map.put("Anil", "10000");
		
		Map<String, String> sortedMap = new TreeMap<>(map);
		System.out.println(sortedMap);
		
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String,String>>(map.entrySet());
		
		list.sort(Map.Entry.comparingByValue());
		System.out.println(list);
		
	}
}
