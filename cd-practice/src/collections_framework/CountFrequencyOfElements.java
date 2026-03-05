package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencyOfElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,2,2,3,3,4,5,5);
		Map<Integer,Integer> map = new HashMap<>();

		for(int n : list) {
			System.out.println("n : " + n);
			System.out.println("get or default : " + map.getOrDefault(n, 0));
		    map.put(n, map.getOrDefault(n, 0) + 1);
		}
		System.out.println(map);
	}
}
