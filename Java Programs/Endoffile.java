
import java.util.Scanner;

public class Endoffile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
			int testcase = 0;
			while(sc.hasNext()){
			    System.out.println(++testcase+" "+sc.nextLine());
			    
		}
			sc.close();
    }
}

	