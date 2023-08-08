package Assignments.Solid_Principle;

// ShapeManager follows DIP principle
class ShapeManager {
    private AreaCalculator areaCalculator;

    public ShapeManager(AreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public double calculateArea(Shape shape) {
        return areaCalculator.calculateArea(shape);
    }
}