package day45_Abstraction.shape;

public final class Triangle extends Shape{

    private double sideLeft;
    private double sideRight;
    private double sideBase;
    private double height;

    public Triangle(double sideLeft, double sideRight, double sideBase, double height) {
        super("Triangle");
        setSideLeft(sideLeft);
        setSideRight(sideRight);
        setSideBase(sideBase);
        setHeight(height);
    }

    public double getSideLeft() {
        return sideLeft;
    }

    public double getSideRight() {
        return sideRight;
    }

    public double getSideBase() {
        return sideBase;
    }

    public double getHeight() {
        return height;
    }

    public void setSideLeft(double sideLeft) {
        this.sideLeft = sideLeft;
    }

    public void setSideRight(double sideRight) {
        this.sideRight = sideRight;
    }

    public void setSideBase(double sideBase) {
        this.sideBase = sideBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (height * sideBase) / 2;
    }

    @Override
    public double perimeter() {
        return sideBase + sideLeft + sideRight;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                ", sideLeft=" + sideLeft +
                ", sideRight=" + sideRight +
                ", sideBase=" + sideBase +
                ", height=" + height +
                '}';
    }
}
