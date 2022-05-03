package day45_Abstraction.shape;

public final class Cylinder extends Shape implements Volume {

    private double radius;
    private double height;
    public static double pi = 3.14;

    public Cylinder(double radius, double height, double pi) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * pi * radius * height + 2 * pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * (2 * pi * radius + height);
    }

    @Override
    public double volume() {
        return pi * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }
}
