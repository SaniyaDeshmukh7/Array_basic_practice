package array;

import java.util.Arrays;

public class SecHighNo {

	public static void main(String[] args) {
		int arr[]={1,5,9,7,3,5,6558,1255,85};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);
		System.out.println(arr[arr.length-1]);

	}

}
