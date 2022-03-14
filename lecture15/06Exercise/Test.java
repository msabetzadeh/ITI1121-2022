public class Test {
	public static void c() {
		System.out.println( "c() :: about to throw exception" );
		throw new RuntimeException( "from c()" );
	}
	public static void b() {
		System.out.println( "b() :: pre-" );
		c();
		System.out.println( "b() :: post-" );
	}
	public static void a() {
		System.out.println( "a() :: pre-" );
		try {
			b();
		} catch ( NumberFormatException e ) {
			System.out.println( "a() :: caught exception" );
		} //catch ( RuntimeException e ) {
			//System.out.println( "a() :: caught RuntimeException exception" );
		//} 
		finally {
			System.out.println( "finally" );
		}
		System.out.println( "a() :: calling b, no try block" );
		b();
		System.out.println( "a() :: post-" );
	}
	public static void main( String[] args ) {
		System.out.println( "main( ... ) :: pre-" );
		a();
		System.out.println( "main( ... ) :: post-" );
	}
}
