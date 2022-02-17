public class Test {
	public static void scan (String expression) {	
	
		Reader reader = new Reader (expression);
	
		while (reader.hasMoreTokens()) {
			System.out.println(reader.nextToken());
		}
	}
	
	public static void main (String[] args) {
		Test.scan(" 3     + 4 * 567    ");
	}

}