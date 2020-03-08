package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 Count all distinct pairs with difference equal to k
 Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.
Examples:

Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2} 

Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8}, 
{8, 12}, {12, 16} and {16, 20} 
 */

/*
 * Solution
 1) Initialize count as 0.
2) Insert all distinct elements of arr[] in a hash map.  While inserting, 
   ignore an element if already present in the hash map.
3) Do following for each element arr[i].
   a) Look for arr[i] + k in the hash map, if found then increment count.
   b) Look for arr[i] - k in the hash map, if found then increment count.
   c) Remove arr[i] from hash table.  
 */

public class DistinctPairs {

	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 4, 2,4};
		int diff = 3;
		int count= 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length; i++) {
			if(! (map.containsKey(arr[i]))) {
				map.put(arr[i], arr[i]);
			}
		}
		System.out.println(">>>"+map.toString());
		for (int i=0;i<arr.length; i++) {
			if(map.containsKey(arr[i]+diff) ) {
				map.remove (arr[i]);
				count++;
			}
			if( map.containsKey(arr[i]-diff)) {
				map.remove (arr[i]);
				count++;
			}
		}
		System.out.println(">>>"+map.toString());
		System.out.println("Pairs : "+count);
	}

}
