public abstract class Shape implements Comparable, Displayable {
	private double x;
	private double y;
	
	public Shape () {
		x = 0;
		y = 0;
	}
	
	public Shape (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
    public final double getX() {
        return x;
    }
    
    public final double getY() {
    	return y; 
    }

    public final void moveTo(double x, double y) {
        this.x = x;
        this.y = y; 
    }
    
    public String toString () {
    	return "Located at: (" + x + "," + y + ")";
	}
	
	public int compareTo (Comparable o) {
	
		Shape other = (Shape) o;
		
		int result;
		
		if (this.area() < other.area()) {
			result = -1;
		} else if (this.area() == other.area()) {
			result = 0;
		} else 
			result = 1;

		return result;
	}
	
	public void display () {
		System.out.println(this);
	}
	
	public abstract double area();
}