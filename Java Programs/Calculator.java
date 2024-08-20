import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		while(true) {
			System.out.println("1.Addition");
			System.out.println("2.Subraction");
			System.out.println("3.Division");
			System.out.println("4.Multication");
			System.out.println("Select The Option: ");
			
			Scanner sc =  new Scanner(System.in);
			String Arthemetic = sc.next();
			if(Arthemetic.equals("1")) {
				System.out.println("You Selected the Addition");
				System.out.println("Enter the Numbers : ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(num1+num2);
			}else if(Arthemetic.equals("2")) {
				System.out.println("You Selected The Subraction");
				System.out.println("Enter The Number: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(num1-num2);
			}else if(Arthemetic.equals("3")) {
				System.out.println("You Selected The Division");
				System.out.println("Enter The Number: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(num1/num2);
			}else if(Arthemetic.equals("4")) {
				System.out.println("You Selected The Multiplication");
				System.out.println("Enter The Number: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println(num1*num2);
			}else {
				System.out.println("Select Correct Option");
				break;
			}
		}
		
		
	}
}
