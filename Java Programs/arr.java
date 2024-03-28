
public class arr {
	public static void main(String [] args) {
		final int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for(int i =0 ; i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		arr[4] = 100;
		System.out.println(arr[4]);
		
		
	}
}
