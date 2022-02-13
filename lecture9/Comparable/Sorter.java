public class Sorter {

	public static void sort2 (Comparable[] a) {
		if (a[0].compareTo(a[1]) > 0) {
			Comparable tmp = a[0];
			a[0] = a[1];
			a[1] = tmp;
		}
	}
}