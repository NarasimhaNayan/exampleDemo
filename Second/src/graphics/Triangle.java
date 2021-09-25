package graphics;

public class Triangle extends Shape {
	private double base,height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public double area() {
		return base*height;
	}
}
