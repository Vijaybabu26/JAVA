import java.util.Scanner;

public class Runpaymentapp {

	public static void main(String[] args) {
		int SelectedOption = 0;
		
		while(true) {
		System.out.println("please select one Option");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Add Bank Account");
		System.out.println("-1.Quit");
		System.out.println("Choose atleast one Option");
		Scanner sc = new Scanner(System.in); 
		String Optstr = sc.next();	
		System.out.println("You selected " + Optstr);
		try {
		SelectedOption = Integer.parseInt(Optstr);
		}catch(NumberFormatException Ea){
			Ea.printStackTrace();
			Ea.getMessage();			
		}
		catch(ArithmeticException Ex){
			Ex.printStackTrace();
			Ex.getMessage();
			System.out.println("Some Errors has Occured in Athematic");
		}
			catch(Exception e){
			e.printStackTrace();
			e.getMessage();
			System.out.println("Some Errors has Occured");
		}
		
		if(Optstr.equalsIgnoreCase("1")){
			
		}
		else if(Optstr.equalsIgnoreCase("2")) {
			
		}
		else if(Optstr.equalsIgnoreCase("3")) {
			
		}
		else if(Optstr.equalsIgnoreCase("-1")) {
			System.out.println("You Have Exit");
			break;
			
		}
		}
		
//		if(str.equals("1")||str.equals("2")||str.equals("3")) {
//			SelectedOption = Integer.parseInt(str);
//		}else {
//			System.out.print("Choose option in the range of 1 to 3");
//		}		
	}

}
