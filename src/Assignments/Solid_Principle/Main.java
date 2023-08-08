package Assignments.Solid_Principle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        AreaCalculator areaCalculator = new AreaCalculator();
        ShapeManager shapeManager = new ShapeManager(areaCalculator);

        double circleArea = shapeManager.calculateArea(circle);
        double squareArea = shapeManager.calculateArea(square);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Square Area: " + squareArea);
    }
}

