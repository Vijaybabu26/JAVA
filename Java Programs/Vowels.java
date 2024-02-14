package programs;

public class Vowels {
	public static void main(String[] args) {
		int c = 0;
		String s1 ="Hello World";
		s1 =s1.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
				c++;
				System.out.println("count of vowels "+c);
			}
		}
	}
}
