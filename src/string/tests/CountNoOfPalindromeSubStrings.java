package string.tests;

class CountNoOfPalindromeSubStrings {
	/*
	 * * Complete the 'countPalindromes' function below. * * The function is
	 * expected to return an INTEGER. * The function accepts STRING s as parameter.
	 */
	static boolean isPalindrome(String s) {
		if ("".equals(s) || s == null) {
			return false;
		} else {
			int i = 0, j = s.length() - 1;
			while (i < j) {
				// System.out.println("i:"+i+"j:"+j);
				if (s.charAt(i) != s.charAt(j)) {
					// System.out.println("Not a palindrome:"+s);
					return false;
				}
				i++;
				j--;
			}
			//System.out.println("Its a palindrome:" + s);
			return true;
		}
	}

	public static int countPalindromes(String s) {
		int noOfPalindromes = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				// System.out.println("Checking:"+s.substring(i, j));
				if (CountNoOfPalindromeSubStrings.isPalindrome(s.substring(i, j)))
					noOfPalindromes++;
			}
		}
		return noOfPalindromes;
	}

	public static void main(String args[]) {
		String str = "abccba";
		System.out.println("PalindromeStrings:" + countPalindromes(str));
	}
}
