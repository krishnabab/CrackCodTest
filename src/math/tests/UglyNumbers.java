package math.tests;

import java.util.Scanner;

/*
 
 Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included. Write a program to find Nth Ugly Number.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. For each testcase there is one line of input that contains the number N.
 Example:
Input:
2
10
4
Output:
12
4 
 
 */

public class UglyNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTCs = scanner.nextInt();
		int nthUglyNo1 = scanner.nextInt();
		int nthUglyNo2 = scanner.nextInt();
		findnthuglyNo(nthUglyNo1);
		findnthuglyNo(nthUglyNo2);
		
}	
	public static void findnthuglyNo(int nthUglyNo ) {
		int i =1, count = 1;
		while (nthUglyNo > count) {
			i++;
			//System.out.println("checking :"+i);
			if( isItUglyNo(i) == 1 ) {
				count++;
			}
		}
		System.out.println(""+i);
	}
	public static int isItUglyNo(int n) {
		n = maxDivide(n, 2);
		n = maxDivide(n, 3);
		n = maxDivide(n, 5);
		
		return (n == 1)? 1 : 0; 
				
	}
	static int maxDivide(int a , int b) {
		while (a%b == 0) {
			//System.out.println(" "+a+" "+b);
			a = a/b;
		}
		//System.out.println("A>>>"+a);
		return a;
	}
}
