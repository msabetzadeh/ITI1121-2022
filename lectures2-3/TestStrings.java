public class TestStrings {
	// Example for interning of strings in Java
	public static void main (String[] args) {
		String s1 = "My string";
		String s2 = "My string";
		
		if (s1 == s2) {
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");		
		}
		
		s1 = "ab";
		s2 = s1 + "c";
		s1 = s1 + "c";
		
		if (s1.equals(s2)) {
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");
			System.out.println("Yet, s1 =" + s1 + " and s2=" + s2);	
		}
	}

}