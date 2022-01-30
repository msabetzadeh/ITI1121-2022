public class ScopeTest {

	public static void main (String args[]) {
		ScopeTest s = new ScopeTest();
		System.out.println("x = " + s.x);
		System.out.println("y = " + s.y);
	}
	
	public void setValues() {
		x = 2;
		y = 5;
		
		{
		 int k = 0;
		}
		
		// k++; // trying uncommenting this statement and see what happens. Why?
	}
	
private int x = 1, y = x + 1;  

}
