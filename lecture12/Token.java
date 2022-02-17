public class Token {
    private static final int INTEGER = 1;
    private static final int SYMBOL = 2;
    
    private int iValue;
    private String sValue;
    private int type;

    public Token( int iValue ) {
        this.iValue = iValue;
        type = INTEGER;
    }

    public Token( String sValue ) {
        this.sValue = sValue;
        type = SYMBOL;
    }

    public int iValue() {
    	return iValue;
    }

    public String sValue() {
    	return sValue;
    }

    public boolean isInteger() { return type == INTEGER; }

    public boolean isSymbol() { return type == SYMBOL; }
    
    public String toString() {
    	if (type == INTEGER) {
    		return "INTEGER: " + iValue;
    	}
    	return "SYMBOL: " + sValue;
    }
}
