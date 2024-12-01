package Q5;

public class AreaCalculator {
    public static void calculateRectangleArea(double length, double width){
        double area_of_a_rectangle = length * width;
        System.out.println("Area of the rectangle: " + area_of_a_rectangle);
    }

    public static void calculateSquareArea(double sideLength) {
        System.out.println("Area of the square: " + sideLength * sideLength);
    }
}
