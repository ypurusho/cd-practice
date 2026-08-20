package java8features;

import java.util.Optional;

public class OrElseVsOrElseGet {

	 public static void main(String[] args) {
		 Optional<String> opt = Optional.ofNullable("java");
		 //orElse will always executes getDefault even value is present
		 String language = opt.orElse(getDefault());
		 System.out.println(language);
		 
		 //orElseGet will executes getDefault only if value is not present
		 String newName = opt.orElseGet(()-> "supplier executed");
		 System.out.println(newName);
	}

	private static String getDefault() {
		System.out.println("Default invoked");
		return "python";
	}
	
}
