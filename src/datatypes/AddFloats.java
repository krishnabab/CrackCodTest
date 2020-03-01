package datatypes;

public class AddFloats {
	public static void main (String args[]) {
		float f = sum(2.3, 4.0);
		System.out.println("Sum value:"+f);
	}

	private static float sum(double d, double e) {
			
		return (float) (d+e);
	}
	
}
