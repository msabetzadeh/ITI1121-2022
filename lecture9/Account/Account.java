public class Account {
	private int id;
	private String name;
	
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean equals (Object other) {
		boolean result = true;
		
		if (other == null) {
			result = false;
		} else if (this.getClass() != other.getClass()) {
			result = false;
		} else {
			Account acc = (Account) other;
			
			if (this.id != acc.id) {
				result = false;
			} else if (name == null && acc.name != null) {
				result = false;
			} else if (name != null && !name.equals(acc.name)) {
				result = false;
			}
			
		}
		
		return result;
	}

}