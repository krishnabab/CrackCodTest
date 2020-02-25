package recursive;

public class EggDrops {

	public static void main(String[] args) {
		int f = 20;
		int e = 1; 
		
		System.out.println("No of minimum Egg Drops : "+ findMineggDrops(e,f));

	}
	/* Function to get minimum number of  
    trials needed in worst case with e  
    eggs and f floors */
	private static int findMineggDrops(int e, int f) {
		
		 // If there are no floors, then  
        // no trials needed. OR if there  
        // is one floor, one trial needed.  
        if (f == 1 || f == 0)  
            return f;  
      
        // We need e trials for one egg and f floors  
        if (e == 1)  
            return f;  
      
        int min = Integer.MAX_VALUE;  
        int x, res;  
      
        // Consider all droppings from  
        //1st floor to fth floor and  
        // return the minimum of these  
        // values plus 1.  
        for (x = 1; x <= f; x++)  
        {  
            res = Math.max(findMineggDrops(e-1, x-1),  
            		findMineggDrops(e, f-x));  
            if (res < min)  
                min = res;  
        }  
      
        return min + 1;  
	}

}
