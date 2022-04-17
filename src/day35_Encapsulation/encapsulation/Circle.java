package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }


    public Circle(double radius) {
        setRadius(radius);
    }

    static {
        pi = 3.14;
    }


    public double calcArea(double radius) {
        double area = pi * radius * radius;
        return area;
    }

    public double calcPerimeter(double radius) {
        double perimeter = pi * 2 * radius;
        return perimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}

/*
2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */