public class Test {
    

	public static double fromOutside(LinkedList<Integer> l){
		
		int sizeOfTest = l.size();
		Integer res ;

		long start = System.currentTimeMillis();

		for(int i = 0; i < sizeOfTest; i++){
			res = l.get(i);
		}

		return System.currentTimeMillis() - start;

	}
	

    public static void main(String[] args) {


		LinkedList<Integer> l = new LinkedList<Integer>();

		int sizeOfTest = 100000;
		for (int i=0; i< sizeOfTest; i++) {
			l.addFirst(new Integer(i));
		}

		System.out.println("Time with method \"fromInside\": " + l.fromInside());
		System.out.println("Time with method \"fromOutside\": " + fromOutside(l));

    }
}
