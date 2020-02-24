package math.tests;

import java.util.Scanner;

public class RectanglesOverlap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTCs = scanner.nextInt();
		int t1l1x = scanner.nextInt();
		int t1l1y= scanner.nextInt();
		int t1r1x = scanner.nextInt();
		int t1r1y = scanner.nextInt();
		int t1l2x = scanner.nextInt();
		int t1l2y = scanner.nextInt();
		int t1r2x = scanner.nextInt();
		int t1r2y = scanner.nextInt();
		
		int t2l1x = scanner.nextInt();
		int t2l1y= scanner.nextInt();
		int t2r1x = scanner.nextInt();
		int t2r1y = scanner.nextInt();
		int t2l2x = scanner.nextInt();
		int t2l2y = scanner.nextInt();
		int t2r2x = scanner.nextInt();
		int t2r2y = scanner.nextInt();
		
		System.out.println(doesTheyOverlap(t1l1x,t1l1y, t1r1x,t1r1y,t1l2x,t1l2y,t1r2x,t1r2y));
		System.out.println(doesTheyOverlap(t2l1x,t2l1y, t2r1x,t2r1y,t2l2x,t2l2y,t2r2x,t2r2y));
		
	}
	static int doesTheyOverlap(int l1x,int l1y, int r1x,int r1y, int l2x,int l2y, int r2x, int r2y) {
		// Not overlapping 
		if (l1x > r2x || l2x > r1x) {
			System.out.println(l1x + ""+ r2x +  ""+ l2x + "" + r1x );
		return 0;
		}
		// Not overlapping 
		if (l1y < r2y || l2y < r1y) {
			System.out.println(l1y + ""+ r2y +  ""+ l2y + "" + r1y);
			return 0;
		}
		// Both overlapping 
		return 1; 
	}
}

/* Failed for 
 * 
2
0 10 10 0 
5 5 15 0 
99 39 10 34
19 41 26 18
*/
