import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in centimeters: ");
        int length = input.nextInt();
        int inches = (int)(length/2.54);
        int feets = inches/12;
        System.out.println(length + "cm is equal to " + feets + "feet and " + (inches%12) + "inches.");
    }
}
