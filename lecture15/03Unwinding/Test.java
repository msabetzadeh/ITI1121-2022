public class Test {
    public static void c() {
        System.out.println( "c: -1-" );
        if ( true ) {
            throw new RuntimeException( "top of the world!" );
        }
        System.out.println( "c: -2-" );
    }
    public static void b() {
        System.out.println( "b: -1-" );
        c();
        System.out.println( "b: -2-" );
    }
    public static void a() {
        System.out.println( "a: -1-" );
        b();
        System.out.println( "a: -2-" );
    }
    public static void main( String[] args ) {
       System.out.println( "m: -1-" );
       a();
       System.out.println( "m: -2-" );
    }
}
