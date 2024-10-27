import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int asterisks = 1;
        int spaces = rows - 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            spaces--;
            for(int k=0; k<asterisks; k++){
                System.out.print("* ");
            }
            asterisks++;
            System.out.println();
        }
    }
}


/*
        rows=3
--*     spaces:2, asterisks:1
-* *    spaces:1, asterisks:2
* * *   spaces:0, asterisks:3

 */








//import java.util.Scanner;
//public class Q3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        int rows = scanner.nextInt();
//        int spaces = rows-1;
//        int asterisks = 1;
//        for (int i = 1; i <= rows; i++) {
//            // Print spaces
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            // Print asterisks
//            for (int k = 1; k <= asterisks; k++) {
//                System.out.print("*");
//            }
//            System.out.println(); // Move to the next line
//            spaces--;
//            asterisks += 2;
//        }
//    }
//}


/*
---*      spaces:3, asterisks:1
--***     spaces:2, asterisks:3
-*****    spaces:1, asterisks:5
*******   spaces:0, asterisks:7
*/
