package geometry;

public class Cone extends Circle implements Volume {
	private Sector s;

	public Cone() {
		super();
		this.s = new Sector();
	}

	public Cone(double r, double h) {
		super(r);
		double busbar = Math.sqrt(super.getRadius() * super.getRadius() + h * h);
		double arc = super.getPerimeter() / busbar;
		this.s = new Sector(busbar, arc);
	}

	public double getHight() {
		return Math.sqrt(s.getBusbar() * s.getBusbar() - super.getRadius() * super.getRadius());
	}

	public double getVolume() {
		return getArea() * this.getHight() / 3;
	}

	public double getArea() {
		return getArea() + s.getArea();
	}
}
