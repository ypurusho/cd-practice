package strings_programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFrequencyOfFirstNonRepatedCharacter {

	public static void main(String[] args) {
		String s = "swiss";
		//using streams
		Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		Optional<Character> option = map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(e -> e.getKey()).findFirst();
		System.out.println(option.orElse(' '));
		
		//using array frequency
		char c = findFrequencyOfFirstNonRepatingCharacter(s);
		System.out.println(c);
		
	}

	private static char findFrequencyOfFirstNonRepatingCharacter(String s) {
		int[] freq = new int [256];
		for(int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] == 1) {
				return s.charAt(freq[i]);
			}
		}
		
		return '\0';
	}
}
