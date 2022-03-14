public class Test {
    public static boolean error() {
        if ( true ) {
            throw new RuntimeException( "an Exception" );
		}
        return false;
    }
    
    public static boolean display() {
        System.out.println( "-2-" );
        return true;
    }
    
    public static void main( String[] args ) {
        System.out.println( "-1-" );
        try {
        if ( error() || display() ) {
            System.out.println( "-3-" );
        }
        }
        finally {
        	System.out.println("finally!");
        }
        System.out.println( "-4-" );
    }
}