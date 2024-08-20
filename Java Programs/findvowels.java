import java.util.Scanner;

public class findvowels {
	public static void main(String args[]) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			System.out.println(str);
			char ch = str.charAt(0);
			if(ch == 'a'|| ch =='e' || ch == 'i'|| ch =='o' || ch =='u') {
				System.out.println("String Contains Vowels"+ ch);
			}else {
				System.out.println("Not Pk");
			}
		}
		
	}
}
