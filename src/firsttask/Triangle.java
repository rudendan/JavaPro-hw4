package java_hw4;

public class Triangle implements Figure {

    private double a,b,c;
//    private final String name = "Triangle";

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0.5 * (a + b + c);
    }

//    @Override
//    public String getName() {
//        return name;
//    }
}
