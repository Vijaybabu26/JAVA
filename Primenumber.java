
public class Primenumber {

	public static void main(String[] args) {
		int x = 79;
		int y=0;
		int count = 0;
		y = x/2;
		if(x==1 || x==0) {
			System.out.println(x + " is not a prime number");
		}else
		{
		for(int i=2;i<=y;i++){
					if(x%i==0) {
				System.out.println(x+" is not a prime number");
				};
				i++;
				count=1;
				break;
			}
		}
		if(count==0) {
			System.out.println(x+" is a prime number");
		}
		
	}

}
