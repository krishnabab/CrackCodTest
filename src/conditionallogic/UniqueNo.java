package conditionallogic;

public class UniqueNo {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,6,4,3,2,1};
		int res = ar[0];
		for (int i=1;i<ar.length ; i++) {
			res = res ^ ar[i];
		}
		System.out.println("Unique no:"+res);
 	}

}
