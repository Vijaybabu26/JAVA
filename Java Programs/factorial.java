import java.util.Scanner;

public class factorial {
	public static void main (String Args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			long factorial = sumfactorial(num);
			System.out.println("The Factorial of "+num+" is "+factorial );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static long sumfactorial(int n) {
		long factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial *= i;
		}
		return factorial;
		
	}
}
