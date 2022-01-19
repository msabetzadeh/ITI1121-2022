public class TestBoxing {
	public static void main (String[] args) {
	
    	long start, stop;

    	start = System.currentTimeMillis ();
		long s1 = (long) 0;
		for (int j = 0; j < 100000000; j++ ) {
			s1 = s1 + (long) 1; 
		}
		stop = System.currentTimeMillis();
		
		System.out.println("Time elapsed: " + (stop - start));

	    start = System.currentTimeMillis ();
		Long s2 = (long) 0;
		for (int j=0; j<100000000; j++ ) {
			s2 = s2 + (long) 1;
		}
		
		stop = System.currentTimeMillis();
		
		System.out.println("Time elapsed: " + (stop - start));

	}
}

		//long start, stop, elapsed;
		//start = System.currentTimeMillis ();
		//stop = System.currentTimeMillis();
		//elapsed = stop - start;