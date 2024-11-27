package geometry;

public class Cylinder extends Circle implements Volume {
	private Rectangle side;

	public Cylinder() {
		super();
		this.side = new Rectangle();
	}

	public Cylinder(double r, double h) {
		super(r);
		this.side = new Rectangle(super.getPerimeter(), h);
	}

	public double GetHight() {
		return this.side.getHeight();
	}

	public double getVolume() {
		return super.getArea() * this.side.getHeight();
	}

	public double getArea() {
		return super.getArea() * 2 + side.getArea();
	}

	public double getPerimeter() {
		return super.getPerimeter() * 2;
	}
}
