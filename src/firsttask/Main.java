package firsttask;

class Main {

    public static void main(String[] args) {

        Figure[] figures = {new Square(4.0),new Circle(4.0),new Triangle(5.0, 3.0, 4.0)};

        System.out.println("The sum of the area of all shapes " + area(figures));
    }
    private static double area(Figure[] figures) {
        double sum = 0.0;
        for (Figure figure:figures) {
            sum = sum + figure.getArea();
        }
        return sum;
    }
}

