package Q4;

public class MathOperations {
    private static double pi = 3.14159;

    public static double calculateCircleArea(double radius){
        double area = pi * radius * radius;
        return area;
    }

    public static double calculateSquareArea(double side){
        double area = side * side;
        return area;
    }

    public static double getPi() {
        return pi;
    }
}
