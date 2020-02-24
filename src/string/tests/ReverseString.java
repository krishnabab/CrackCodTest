package string.tests;

import java.util.Scanner;

class ReverseString {
	public static void main (String[] args) {
		System.out.println("How many string you want to reverse?: ");
		Scanner scanner = new Scanner( System. in);
		int noOfStrings = scanner.nextInt();
		String strings[] = new String[noOfStrings];
		for( int i=0; i<noOfStrings; i++) {
			System.out.println("Enter a String:");
			scanner = new Scanner(System.in);
			strings[i] = scanner.nextLine();
			System.out.println("String received :"+strings[i]);
			System.out.println("Reversed String : " + reverseMe(strings[i]));
		}
		scanner.close();
	}
	// Take given string and split them to words and construct array
	// start from end of array and append to string
    static String reverseMe(String s1) {
    	String words[] = s1.split("\\.");
		s1="";
		for(int i=words.length -1 ; i>=0 ; i--) {
			//System.out.println(words[i]);
			if(i!=0)
			s1+=words[i]+".";
			else s1+=words[i];
		}
		//System.out.println("OP:"+s1);
		return s1;
    	
    }
}