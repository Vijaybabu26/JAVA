package programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] Args) {
		String s1 ="RACE";
		String s2= "CARE";
		if(s1.length()==s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean b = Arrays.equals(ch1,ch2);
			System.out.println(b + " The Given Strings are Anagram ");
		}
		else
		{
			System.out.println("the given strings length not equal");			
		}
	}
}
