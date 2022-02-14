import java.util.StringTokenizer;

public class Reader {
	private StringTokenizer tokenizer;
	
	public Reader (String expression) {
		tokenizer = new StringTokenizer(expression);
	}
	
	public boolean hasMoreTokens() {
		return tokenizer.hasMoreTokens();
	}
	
	public Token nextToken () {
		String str = tokenizer.nextToken();
		
		if (str.matches("-?\\d+")) {
			return new Token (Integer.parseInt(str));
		}
		
		return new Token (str);
	}
}