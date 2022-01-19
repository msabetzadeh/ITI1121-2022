// Extra material for self-study
public class TestIntegers {
	// Example for interning of small numeric values (does not apply to Float and Double)

	public static void main (String[] args) {
		
		// Try with l1,l2=127 and l1,l2=128 and see what happens!
		
		Long l1 =  Long.valueOf(128l);
		Long l2 =  Long.valueOf(128l);
		
		if (l1 == l2) {
			System.out.println("l1 == l2");
		} else {
			System.out.println("l1 != l2");
			System.out.println("Yet, l1=" + l1 + " and l2=" + l2);	
		}
		
		Long l3 = l1 + 1;
		Long l4 = l2 + 1;

		if (l3 == l4) {
			System.out.println("l3 == l4");
		} else {
			System.out.println("l3 != l4");
			System.out.println("Yet, l3 = " + l3 + " and l4 = " + l4);	
		}


	}
}
