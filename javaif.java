class Solution{

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args
     * @param System
     */
    public static void main(String[] args, Object System)
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if(n%2 == 0) {
        	if(n >= 2 && n<=5) {
        		System.out.println("Not weird");
        	}
        	else if (n>=6 && n<=20){
        		System.out.println("weird");
        	}
        	else {
        		System.out.println("Not weird");
        	}
        }
        else {
        	System.out.println("weird");
        }
    }
        
    }