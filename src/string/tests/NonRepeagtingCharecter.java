package string.tests;
/*
 Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.

Input:
The first line contains T denoting the number of testcases. Then follows description of testcases.
Each case begins with a single integer N denoting the length of string. The next line contains the string S.

Output:
For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating character.

Constraints:
1 <= T <= 900
1 <= N <= 104

Example:
Input :
3
5  
hello
12
zxvczbtxyzvy
6
xxyyzz

Output :
h
c
-1
 */
import java.util.Scanner;

public class NonRepeagtingCharecter {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner( System. in);
		//String s = scanner.nextLine();
		String s = "hello";
		System.out.println(">>>"+getNonRepeatingChar(s));
		

	}

	private static String getNonRepeatingChar(String s) {
		int i,j;
		for(i=0;i<s.length();i++)
		{
			for(j=0;j<s.length();j++) {
				//System.out.println("s.charAt(i) >> "+s.charAt(i)+"s.charAt(j) >>>"+s.charAt(j));
				if(s.charAt(i) == s.charAt(j) && i!=j ) {
					System.out.println("break");
					break;
				}
			}
			//System.out.println("J"+j+"len"+s.length());
			if(j==s.length())
			{
				//System.out.println("s>>"+s.charAt(i));
			return String.valueOf(s.charAt(i));
			}
		}
		return "-1";
	}

}
/*
 Input string: str = geeksforgeeks
1: Construct character count array from the input string.
   ....
  count['e'] = 4
  count['f'] = 1
  count['g'] = 2
  count['k'] = 2
  ……
2: Get the first character who's count is 1 ('f').
  
*/