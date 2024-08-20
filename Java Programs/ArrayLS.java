import java.util.Scanner;

public class ArrayLS {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Size Of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter The Elements : ");
			arr[i] = sc.nextInt();
		}
		int smallest = smallest(arr);
		int largest = largest(arr);
		double average = average(arr);
		if(arr.length>0) {
			for(int i = 0; i<=arr.length-1 ; i++) {
				System.out.println(arr[i]);
			}
			
		
		}
		System.out.println("smallest number in arr is "+smallest);
		System.out.println("largest Number in arr is "+ largest);
		System.out.println("Average Number of arr is " + average);
		
	}
	public static int smallest(int[] arr) {
		int smallest = arr[0];
		for(int i = 1; i<=arr.length-1; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
		
	}
	public static int largest(int[] arr) {
		int largest = arr[0];
		for (int i=0;i<arr.length-1;i++) {
			if(arr[i]> largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	public static double average(int [] arr) {
		int average = 0;
		for(int i: arr) {
			average += i;
		}
		return (double)average/arr.length;
	}
}
