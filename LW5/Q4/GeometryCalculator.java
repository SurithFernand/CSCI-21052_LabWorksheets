package Q4;

public class GeometryCalculator {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println("pi: " + mathOperations.getPi());
        System.out.println("Area of a circle with radius 5: " + mathOperations.calculateCircleArea(5));
        System.out.println("Area of a square with side length 4: " + mathOperations.calculateSquareArea(4));
    }
}
