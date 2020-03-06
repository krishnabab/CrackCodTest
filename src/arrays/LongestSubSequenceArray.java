package arrays;

import java.util.Arrays;
import java.util.Collections;

public class LongestSubSequenceArray {

	public static void main(String[] args) {
		int arr[] = {1 ,9,3, 10, 4, 20, 2};
		System.out.println("Given Array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted:"+Arrays.toString(arr));
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i+1] != arr[i]+1) {
				System.out.println(" "+arr[i]);
				break;
			}
			else {
				System.out.print(" "+arr[i]);
			}
		}
	}

}
