import java.util.Scanner;

public class ArrayMaxMin {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr= new int [row][col];
		for(int i=0; i< arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i< arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		int min = Min(arr);
		int max = Max(arr);
		System.out.println(min);
		System.out.println(max);
		
	}
	public static int Min(int[][] arr) {
		int min = arr[0][0];
		for(int i=1; i< arr.length;i++) {
			for(int j=1; j<arr[i].length;j++) {
				System.out.println();
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}
	public static int Max(int[][] arr) {
		int max = arr[0][0];
		for(int i=1; i< arr.length;i++) {
			for(int j=1; j<arr[i].length;j++) {
				System.out.println();
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
}
