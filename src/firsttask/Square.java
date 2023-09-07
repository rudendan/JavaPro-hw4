package java_hw4;

public class Square implements Figure {

    private double side;
//    private final String name = "Square";

    public Square(double side) {

        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
//    public String getName() {
//        return name;
//    }
}