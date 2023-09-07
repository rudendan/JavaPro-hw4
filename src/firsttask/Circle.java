package firsttask;


public class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2)  * Math.PI;
    }

}



