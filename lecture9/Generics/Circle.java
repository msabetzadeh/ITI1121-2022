public class Circle extends Shape {
	private double radius;
	
	public Circle () {
		super();
		radius = 0;
	}
	
	public Circle (double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public double getRadius() {
        return radius;
    }
    
    public double area() {
    	return radius * radius * Math.PI;
    }
    
    public String toString() {
       return "CIRCLE: " + super.toString() + ", with radius " + radius;
    }
}

