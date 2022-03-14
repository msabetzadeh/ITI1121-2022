public class Test {

	public static void main(String[] args) throws Exception {
	
		System.out.println("1");
		
		try {
		if (true) {
			throw new Exception("My exception!");
		}
		} catch (RuntimeException e) {
		}
		
		System.out.println("2");
	}
}