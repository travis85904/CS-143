package graphics;

public class Circle extends Shape {
	protected double radius;
	
	public Circle() {
		super(0.0, 0.0);
		radius = 1.0;
	}
	
	public Circle(double centerX, double centerY, double radius) {
		super(centerX, centerY);
		this.radius = radius;
	}

	public double Area() {
		return Math.PI * radius * radius;
	}
	
	public void Draw(double x, double y) {
		super.SetLocation(x, y);
		System.out.println("Drawing Circle");
	}

}
