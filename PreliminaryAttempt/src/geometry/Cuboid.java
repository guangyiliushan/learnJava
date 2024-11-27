package geometry;

public class Cuboid extends Rectangle implements Volume {
	private double depth;

	public Cuboid() {
		super();
		this.depth = 0;
	}

	public Cuboid(double x, double y, double z) {
		super(x, y);
		this.depth = z;
	}

	public double getArea() {
		return 2 * (super.getHeight() * this.depth + super.getWidth() * this.depth + super.getArea());
	}

	public double getPerimeter() {
		return 4 * (super.getHeight() + this.depth + super.getWidth());
	}

	public double getVolume() {
		return super.getHeight() * this.depth * super.getWidth();
	}

}
