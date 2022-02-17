public class LRScanner {

	public static int execute (String expression) {
		Token op = null;
		int l = 0, r = 0;

		Reader reader = new Reader (expression);
		
		l = reader.nextToken().iValue();
	
		while (reader.hasMoreTokens()) {
			op = reader.nextToken();
			r = reader.nextToken().iValue();
			l = eval(op, l, r);
		}
		
		return l;
	
	}
	
	public static int eval (Token op, int l, int r) 
	{
		System.out.println("L OP R: " + l + " " + op.sValue() + " " + r);
		int result = 0;
		
		if (op.sValue().equals("+")) {
			result = l + r;
		}
		else if (op.sValue().equals("-")) {
			result = l - r;
		}
		else if (op.sValue().equals("*")) {
			result = l * r;
		}
		else if (op.sValue().equals("/")) {
			result = l / r;
		}

		return result;
	}
	
	public static void main (String[] args) {
		System.out.println("Expression: " + args[0]);
		
		int result = execute(args[0]);
		
		System.out.println("Result: " + result);
	}

}