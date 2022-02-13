public class Test  {
	public static void main (String args[]) {
		Pair<Time,Time> p = new Pair<Time,Time> (new Time(1, 55, 30), new Time(2, 30, 0));
		
		Time t = p.getFirst();
		System.out.println(t.getMinutes());
		
		Pair<String,String> p2 = new Pair<String,String>("Hillary", "Clinton");
		
		String s = p2.getSecond();
		System.out.println(s);
		
		Pair<Integer,Integer> p3 = new Pair<Integer,Integer>(1, 1);
		
		System.out.println(p3.getFirst().getClass());
		
		Pair<Integer, String> p4 = new Pair<Integer, String>(5, "Mike");
		
		Integer i = p4.getFirst();
		String j = p4.getSecond();
	}
}


