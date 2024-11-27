package geometry;

public class Sector extends Circle{
	private double arc;
	public Sector() {
		super();
	}
	public Sector(double r,double arc) {
		super(r);
		this.arc=arc;
	}
	public double getArc() {
		return arc;
	}
	public double getBusbar() {
		return super.getRadius();
	}
	public double getArea() {
		return this.getPerimeter()*super.getRadius()/2;
	}

	public double getPerimeter() {
		return this.arc*super.getRadius();
	}
}
