import java.util.Scanner;

public class primenumber {
	public static void main(String Args[]) {
		Scanner sc =  new Scanner(System.in);
		int i,m=0,flag=0;
		int num = sc.nextInt();
		m= num/2;
		if(num==0 || num==1) {
			System.out.println("Not Prime Number"+num);
		}else {
			for(i=2;i<=m;i++) {
				if(num%i ==0) {
					System.out.println("Not Prime Number"+num);
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("Prime Number"+num);
			}
		}
	}
}
