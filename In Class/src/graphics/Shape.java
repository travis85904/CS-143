package graphics;


abstract public class Shape {

	protected double originX;
	protected double originY;
	
	public Shape() {
		originX = originY = 0.0;
	}
	
	public Shape(double x, double y) {
		originX = x;
		originY = y;
	}
	
	protected void SetLocation(double x, double y) {
		originX = x;
		originY = y;
	}
	
	abstract public void Draw(double x, double y);
	abstract public double Area();
}
