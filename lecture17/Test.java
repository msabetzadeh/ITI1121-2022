public class Test {

    private static void testCircularQueueWithSentinel(){
        
        Queue<Integer> queue = new CircularQueueWithSentinel<Integer>();

        for ( int i=0; i<10; i++ ) {
            queue.enqueue( new Integer( i ) );
        }

        while ( ! queue.isEmpty() ){
            System.out.println( queue );
            System.out.println( queue.dequeue() );
        }


        Queue<String> queue2 = new CircularQueueWithSentinel<String>(3);
        queue2.enqueue( "a" );
        queue2.enqueue( "b" );
        queue2.enqueue( "c" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        queue2.enqueue( "d" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);

        try{
            queue2.dequeue();
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        try{
            queue2.enqueue( "a" );
            queue2.enqueue( "b" );
            System.out.println(queue2);
            queue2.enqueue( null );
        } catch(NullPointerException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        try{
            queue2.enqueue( "c" );
            queue2.enqueue( "d" );
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println(queue2);

    }

    private static void testCircularQueueWithSize(){
        
        Queue<Integer> queue = new CircularQueueWithSize<Integer>();

        for ( int i=0; i<10; i++ ) {
            queue.enqueue( new Integer( i ) );
        }

        while ( ! queue.isEmpty() ){
            System.out.println( queue );
            System.out.println( queue.dequeue() );
        }


        Queue<String> queue2 = new CircularQueueWithSize<String>(3);
        queue2.enqueue( "a" );
        queue2.enqueue( "b" );
        queue2.enqueue( "c" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        queue2.enqueue( "d" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);

        try{
            queue2.dequeue();
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        try{
            queue2.enqueue( "a" );
            queue2.enqueue( "b" );
            System.out.println(queue2);
            queue2.enqueue( null );
        } catch(NullPointerException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        try{
            queue2.enqueue( "c" );
            queue2.enqueue( "d" );
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println(queue2);

    }

    public static void main( String[] args ) {

        System.out.println("Testing CircularQueueWithSentinel...");
        testCircularQueueWithSentinel();

        System.out.println("Testing CircularQueue...");
        testCircularQueueWithSize();


    }
}