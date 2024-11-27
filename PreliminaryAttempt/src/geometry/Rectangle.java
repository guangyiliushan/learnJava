package geometry;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}