package graphics;


public class Rectangle extends Shape {

	protected double length;
	protected double width;
	
	public Rectangle( ) {
		super(0.0, 0.0);
		length = width = 1.0;
	}

	public Rectangle( double originX, double originY, double length, double width) {
		super(originX, originY);
		this.length = length;
		this.width = width;
	}
	
	public double Area() {
		return length * width;
	}
	
	public void Draw(double x, double y) {
		super.SetLocation(x, y);
		System.out.println("Drawing Rectangle");
	}
	
}
