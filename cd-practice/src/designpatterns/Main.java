package designpatterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> address = new HashMap<String, String>();
		address.put("Door. no", "1-23");
		address.put("Street", "KKR Street");
		address.put("Pincode", "514167");
		ImmutableClass im = new ImmutableClass(1l, "ramesh", Arrays.asList(100,98,90), address);
		address.put("Pincode", "349274");
		System.out.println(im);
	}
}
