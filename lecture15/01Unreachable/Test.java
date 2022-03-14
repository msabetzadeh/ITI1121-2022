class Test { 

	public static void a () {
		throw new RuntimeException( "an Exception" ); 	
	}
	
    public static void main( String[] args ) { 

	System.out.println( "-1-" ); 

	try {
		a();
		System.out.println( "-2-" ); 

	}
	finally {
		System.out.println("finally!");
	}

	System.out.println( "-3-" ); 

    } 
} 
