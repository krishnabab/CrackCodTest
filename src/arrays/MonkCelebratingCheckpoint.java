package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MonkCelebratingCheckpoint {

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,9};
		int difference = 2; 
		int operations = 1; 
		System.out.println("MyArr"+Arrays.toString(arr));
		System.out.println("All Sub Arrays : ");
		//printSubArraysRecursion(arr,0,0);
		printSubArrays(arr); 
	}

	private static void printSubArrays(int[] arr) {
		ArrayList<int[]> subArrays = new ArrayList<int[]>();
		for(int i=0;i<arr.length;i++) {
			for (int j=i;j<arr.length;j++) {
				int tempSize = ( j==0) ? j+1 : j ;
				int temp[] = new int[tempSize];
				for(int k=i;k<=j;k++) {
					//System.out.println("Size"+temp.length);
					System.out.println("I:"+i+"J"+j+"K"+k);
					System.out.println(""+arr[k]);
					temp[k] = arr[k];
				}
				subArrays.add(temp);
			}
		}
		
		 for(int tempArr[] : subArrays) {
		 System.out.println(" >"+Arrays.toString(tempArr)); }
		 
		
	}

	private static void printSubArraysRecursion(int []arr, int start , int end) {
		if(end == arr.length)
			return;
		else if (start > end){
			printSubArraysRecursion(arr, 0, end+1);
		}
		else {
			 System.out.print("["); 
			for(int i=start;i<end;i++) {
				System.out.print(" "+arr[i]+",");
			}
			System.out.println(arr[end]+"]"); 
			printSubArraysRecursion(arr, start+1, end);
		}
	}

}
