import java.util.Scanner;

public class OddOrEven {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number To Find ODD Or Even : ");
		int num = sc.nextInt();
		
		if(square(num)) {
			System.out.println(" PERFECT SQUARE" + num);
		}else {

			System.out.println("Not A Perfect Square" + num);
		}
		if(num%2!=0) {
			System.out.println("The Given Number Is Odd Number" + num);
		}else {

			System.out.println("The Given Number Is EVEN Number" + num);
		}
		
	}
	public static boolean square(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt *sqrt == num;
	}
}
