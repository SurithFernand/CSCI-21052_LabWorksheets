import java.util.Scanner;

class Circle{
    public static float computeArea(int radius){
        float area = (float) (Math.PI * radius * radius);
        return area;
    }
    public static float computeCircumference(int radius){
        float circumference = (float)(2 * Math.PI * radius);
        return circumference;
    }
    public static int setRadius(){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        return r;
    }
}

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the inner circle (ri) : ");
        int ri = Circle.setRadius();
        System.out.println("Enter the radius of the outer circle (ro) : ");
        int ro = Circle.setRadius();
        float regionalArea = Circle.computeArea(ro) - Circle.computeArea(ri);
        System.out.println("The area of the circular region(the shaded area): " + regionalArea + " square centimetres");
        float innerCircumference = Circle.computeCircumference(ri);
        System.out.println("The circumference of the inner circle: " + innerCircumference + " cm");
        float outerCircumference = Circle.computeCircumference(ro);
        System.out.println("The circumference of the outer circle: " + outerCircumference + " cm");
    }
}



