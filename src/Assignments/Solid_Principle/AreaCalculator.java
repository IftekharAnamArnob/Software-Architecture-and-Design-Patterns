package Assignments.Solid_Principle;

// AreaCalculator follows SRP and OCP principles
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}