package geometry;

public class MyGeometry {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder(1, 5);
		Circle c = new Circle(cy);
		System.out.println(cy.getRadius());
		System.out.println(cy.GetHight());
		System.out.println(cy.getArea());
		System.out.println(cy.getVolume());
		System.out.println(cy.getPerimeter());
		System.out.println(c.getRadius());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}

}
