package string.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
/*
 Given a number K and string S of digits denoting a positive integer, build the largest number possible by performing swap operations on the digits of S atmost K times.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains a positive integer K. The second line of each test case contains a string of digits denoting a positive integer.

Output:
Print out the largest number possible.

Constraints:
1 <= T <= 100
0 <   S <= 30
0 <   K  <= 10

Examples :
Input:
3
4
1234567
3
3435335
2
1034

Output:
7654321
5543333
4301
 */
public class LongestNuminKswaps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tcs = scan.nextInt();
		int results[] = new int[tcs];
		for(int i=0;i<tcs;i++) {
			int swaps = scan.nextInt();
			String s = scan.next();
			results[i] = getMaxValue(swaps,s);
		}
		scan.close();
		for (int maxValue : results) {
			System.out.println(""+maxValue);
		}
	}

	private static int getMaxValue(int swaps, String s) {
		String strings[] = s.split("");
		int arr[] = new int[strings.length];
		int i=0;
		for(String text : strings) {
			arr[i] = Integer.parseInt(text);
			i++;
		}
		int n = arr.length;
		//System.out.println(">>"+Arrays.toString(arr));
		
		// Auxiliary dictionary of storing the position 
        // of elements 
        int pos[] = new int[n+1]; 
        for (int j = 0; j < n; ++j) {
        	//System.out.println("J>>"+j+"arr[j]"+arr[j]+"pos[arr[j]]"+j);
        	 pos[arr[j]] = j; 
        }
        System.out.println(">>"+Arrays.toString(pos));
        for (int k = 0; k < n && swaps > 0; ++k) 
        { 
              
            // If element is already k'th largest, 
            // then no need to swap 
            if (arr[k] == n-swaps) 
                continue; 
         // Find position of i'th largest value, n-i 
            int temp = pos[n-k]; 
            
            System.out.println("Pos["+(n-k)+"] is:"+"Temp:"+temp);
            
         // Swap the elements position 
            pos[arr[k]] = pos[n-k]; 
            pos[n-k] = k; 
            
            System.out.println("pos["+arr[k]+"] and pos["+(n-k)+"] is swapped" );
            System.out.println(">>"+Arrays.toString(pos));
            // Swap the ith largest value with the 
            // current value at ith place 
            int tmp1 = arr[temp]; 
            arr[temp] = arr[k]; 
            arr[k] = tmp1; 
      
            // decrement number of swaps 
            --swaps; 
            
        }
        System.out.println(">>"+Arrays.toString(pos));
        System.out.println(">>"+Arrays.toString(arr));
		return 1;
	}


	//Reference : https://www.geeksforgeeks.org/largest-permutation-k-swaps/
}
