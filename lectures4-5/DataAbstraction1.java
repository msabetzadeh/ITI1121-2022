public class DataAbstraction1 {
	
	public static boolean equal(Point1 p1, Point1 p2){
		return (p1.x==p2.x && p1.y==p2.y);
	}

	public static Point1 add(Point1 p1, Point1 p2){
		Point1 result = new Point1();
		result.x = p1.x + p2.x;
		result.y = p1.y + p2.y;
		return result;
	}

	public static void main(String[] args){

		// first point
		Point1 p1 = new Point1();
		p1.x = 0;
		p1.y = 3;

		// second point
		Point1 p2 = new Point1();
		p2.x = 1;
		p2.y = 1;
		
		System.out.println(equal(p1,p2));

		Point1 p3 = add(p1,p2);
		System.out.println(p3.x + ", " + p3.y);
	}
}
