package strings_programming;

import java.util.Scanner;

public class PermutationsOfString {

	 
	static void permute(String s, 
	                    String answer)
	{   
		System.out.println("string s : " + s);
		System.out.println("answer is : " + answer );
	    if (s.length() == 0)
	    {
	        System.out.print(answer + "  ");
	        return;
	    }
	    
	    for(int i = 0 ;i < s.length(); i++)
	    {
	    	System.out.println("BEFORE char S is : " + s);
	        char ch = s.charAt(i);
	        System.out.println("char at " + i + " is " + ch);
	        String left_substr = s.substring(0, i);
	        System.out.println("left sbtr " + left_substr);
	        String right_substr = s.substring(i + 1);
	        System.out.println("right sbtr " + right_substr);
	        String rest = left_substr + right_substr;
	        System.out.println("rest : " + rest);
	        permute(rest, answer + ch);
	    }
	}

	// Driver code
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);    
	    String s;
	    String answer="";
	    
	    System.out.print(
	    "Enter the string : ");
	    s = scan.next();
	    
//	    System.out.print(
//	    "\nAll possible strings are : ");
	    permute(s, answer);
	}
	
}
