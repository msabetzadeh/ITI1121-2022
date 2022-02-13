public class Test {

	public static void main (String[] args) {
	
		Account a, b;
		
		a = new Account (1, "Jane Doe");
		b = new Account (1, "Jane Doe");
		
		if (a.equals(b)) {
			System.out.println("a equals b");
		} else {
			System.out.println("a and b are not equal");
		}
	}
}