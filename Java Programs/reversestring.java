

public class reversestring {
	public static void main(String Args[]) {
		String str = "Vijay Babu";
		char[] arr = str.toCharArray();
		System.out.println(arr);
		int left = 0;
		int right = arr.length-1;
		System.out.println(right);
		
		while(left<right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		System.out.println(new String(arr));
	
	}
}
