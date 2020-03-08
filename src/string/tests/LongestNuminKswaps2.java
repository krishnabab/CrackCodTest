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
public class LongestNuminKswaps2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tcs = scan.nextInt();
		for(int i=0;i<tcs;i++) {
			int swaps = scan.nextInt();
			String s = scan.next();
			getMaxValue(swaps,s);
		}
		scan.close();
	}

	private static void getMaxValue(int swaps, String s) {
		String maxVal="";
		//Convert String to Chars Array
		//char[] charArr = s.toCharArray();
	    //String[] strArr = String.valueOf(charArr).split("");
		String[] strArr = s.split("");
		//sort the string array
		Arrays.parallelSort(strArr);
		//Store in temp array
		String[] temp = Arrays.copyOf(strArr,strArr.length);
		for(int i=0;i<swaps ; i++) {
			//find the index of max in the temp array
			int tempIndex = Arrays.asList(temp).indexOf(Collections.max(Arrays.asList(temp)));
			//current position's value of stringArray is less than temp max index then swap
			if (Integer.valueOf(strArr[i]) < Integer.valueOf(temp[tempIndex]))
			strArr = swap(strArr, i,tempIndex );
			//Mark that used max value as zero so that it will not be used again
			temp[ Arrays.asList(temp).indexOf(Collections.max(Arrays.asList(temp))) ] = "0";
		}
		
		for(int i =0; i < strArr.length;i++) {
			maxVal = maxVal+strArr[i];
		}
		System.out.println(maxVal);
		
	}
	private static String[] swap(String[] strArr, int i, int j) {
		String s = strArr[i];
		strArr[i] = strArr[j];
		strArr[j] = s;
		//Return modified stringArray
		return strArr;
	}

	
}
