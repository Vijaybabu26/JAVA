import java.util.Scanner;

public class piladrome {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean isPaladrome = ispaladrome(str);;
		
		if(isPaladrome){
			System.out.println("Given String Is Pildrome: " + str);
		}else {
			System.out.println("Given String Is Not a Piladrome "+ str);
		}
	}
	public static boolean ispaladrome(String str) {
		char[] arr = str.toCharArray();
		int start= 0;
		int end = arr.length-1;
		while(start<end) {
			if(arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
 	}
}
