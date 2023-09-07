package java_hw4;


public class Circle implements Figure {

    private final double radius;
//    private final String name = "Circle";

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2)  * Math.PI;
    }

//    public String getName() {
//        return name;
//    }
}



