package string.tests;

import java.util.HashMap;

public class CountCharsinString2 {
	
	// Suppose we are given a string “aaabbbbbccccdaa”, then we to print “a3b5c4d1a2”.

	public static void main(String[] args) {
		String input = "aaabbbbbccccdaa";
		String myString = "";
		int count =1; 
		int i;
		//HashMap<Character, Integer> output = new HashMap<Character, Integer>();
		for (i =1 ; i< input.length() ; i++) {
			if ( input.charAt(i) != input.charAt(i-1) )
			{
				//output.put(input.charAt(i-1), count);
				myString = myString + input.charAt(i-1) + count;
				count =1;
			}
			else count++;
		}
		myString = myString + input.charAt(i-1) + count;
		//output.put(input.charAt(i-1), count);
		//for (char c : output.keySet()) {
		//	myString = myString +  c + output.get(c);
		//}
		System.out.println("Out:"+myString);

	}
}
