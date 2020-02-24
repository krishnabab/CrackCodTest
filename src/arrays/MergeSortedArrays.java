package arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 
 */
public class MergeSortedArrays {

	public static void main(String[] args) {
		int arr1[] = {1, 5, 9, 10, 15, 20};
		int arr2[] = {2, 3, 8, 13};
		int i,j;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		for (i=0;i<arr1.length;i++) {
			for (j=0;j<arr2.length;j++) {
				if(arr1[i] > arr2[j]) {
					int temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j]= temp;
				}
			}
		
		}
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	

}
