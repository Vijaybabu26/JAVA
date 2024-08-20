import java.util.Scanner;

public class oddfinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("ENTER THE NUMBER: ");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i]= sc.nextInt();
		}
		boolean hasOdd = false;
		for(int number : arr) {
			if(number%2!=0) {
				hasOdd = true;
				break;
			}
		}
		
		if(hasOdd) {
			System.out.println("Odd Number Is There");
		}else {
			System.out.println("Odd Number Is Not There");
		}
		
	}
}
