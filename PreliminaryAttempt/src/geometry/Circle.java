package geometry;

public class Circle implements Shape {
	private double radius;

	public Circle() {
		this.radius = 0;
	}

	public Circle(double r) {
		this.radius = r;
	}

	public Circle(Circle c) {
		this.radius = c.radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}
	
	public boolean equal(Object sh) {
		if (sh instanceof Shape) {
			return true;
		}
		return false;
	}
}
