package firstPackage;

public class Cone extends Circle implements Volume {
	private double height;

	public Cone() {
		super();
		this.height = 0;
	}

	public Cone(double r, double h) {
		super(r);
		this.height = h;
	}

	public double getVolume() {
		return getArea() * this.height / 3;
	}

	public double getArea() {
		return getArea() + getPerimeter() * Math.PI * Math.sqrt(getRadius() * getRadius() + this.height * this.height);
	}
}
