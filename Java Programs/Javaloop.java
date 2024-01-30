
public class Javaloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int t=1;
        for(int i=0;i<t;i++){
            int a = 1;
            int b = 1;
            int n = 10;
            int calc = a;
            for(int j=0;j<n;j++){
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
       
    }
	}


