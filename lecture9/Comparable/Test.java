public class Test  {
	public static void main (String args[]) {
		
		Comparable [] array = new Comparable[2];
		
		array[0] = new Circle (5, 5, 15);
		array[1] = new Rectangle(5, 10, 2, 3);
		//array[1] = new Time (5, 5, 15);
		
		Sorter.sort2(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + "'s " + array[i]);
		}
/*		
		Displayable [] array2 = new Displayable[2];
		array2[0] = array[0];
		array2[1] = array[1];
		
		for (int i = 0; i < array2.length; i++)
			array2[i].display();
			
		System.out.println("HERE!!!!" + array2[0].toString());
*/		
	}
}


