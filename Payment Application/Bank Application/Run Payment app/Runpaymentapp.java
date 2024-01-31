import java.util.Scanner;

public class Runpaymentapp {

	public static void main(String[] args) {
				int SelectedOption;
			System.out.println("please select one Option");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Add Bank Account");
			System.out.println("Choose atleast one Option");
			Scanner sc = new Scanner(System.in); 
				String str = sc.next();
				if(str.equals("1")||str.equals("2")||str.equals("3")) {
				SelectedOption = Integer.parseInt(str);
				}else {
					System.out.print("Choose option in the range of 1 to 3");
				}
		
	}

}
