package other;

import java.util.HashMap;
import java.util.Scanner;

/*
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.
MS Excel columns has a pattern like A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. In other words, column 1 is named as “A”, column 2 as “B”, column 27 as “AA”.

Input:
The first line of each input consists of the test cases. And, the second line consists of a number N.

Output:
In each separate line print the corresonding column title as it appears in an Excel sheet.

Constraints:
1 ≤ T ≤ 70
1 ≤ N ≤ 4294967295

Example:
Input:
2
28
13
Output:
AB
M
 */
public class ExcelColoumnName {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int noOfTCs = myScan.nextInt();
		int coloumnNo1 = myScan.nextInt();
		int coloumnNo2 = myScan.nextInt();
		
		System.out.println(getcoloumnName(coloumnNo1));
		System.out.println(getcoloumnName(coloumnNo2));
		
		
	}

	private static StringBuilder getcoloumnName(int coloumnNo) {
		StringBuilder coloumnName =  new StringBuilder();
		while (coloumnNo > 0 ) {
			int rem = coloumnNo % 26 ; 
			if (rem == 0 ) {
				coloumnName.append("Z");
				coloumnNo = (coloumnNo / 26) - 1; 
			}
			else {
				coloumnName.append((char)((rem-1)+ 'A'));
				coloumnNo = coloumnNo / 26;
			}
			
		}
		return coloumnName.reverse();
	}
}
