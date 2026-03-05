package collections_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,4,3,5,1,3,4);
		//Set<Integer> set = new LinkedHashSet<>(list);
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
	}
}
