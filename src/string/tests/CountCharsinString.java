package string.tests;

import java.util.HashMap;

public class CountCharsinString {
	
	// Suppose we are given a string “aaabbbbbccccdaa”, then we to print “a5b5c4d1”.

	public static void main(String[] args) {
		String input = "aaabbbbbccccdaa";
		String myString = "";
		HashMap<Character, Integer> output = new HashMap<Character, Integer>();
		for (int i =0 ; i< input.length() ; i++) {
			int count =0; 
			for (int j=0; j<input.length() ; j++) {
				if (input.charAt(i) == input.charAt(j) ) {
					count = count +1;
					output.put(input.charAt(i), count);
				}
			}
		}
		for (char c : output.keySet()) {
			myString = myString +  c + output.get(c);
		}
		System.out.println("Out:"+myString);

	}
}
