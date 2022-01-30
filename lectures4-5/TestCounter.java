public class TestCounter {
    public static void main( String[] args ) {
        Counter counter = new Counter();
        System.out.println( "counter.getValue()->" + counter.getValue() );
        
        for ( int i=0; i<5; i++ ) {
        	counter.increment();
        	System.out.println( "counter.getValue()->" + counter.getValue() );
        }
    }
}
