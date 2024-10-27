import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Create an array to store the numbers
        int[] numbers = new int[5];
        // Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers, one at a time:");
        // Read and store the numbers in the array
        for(int i=0; i<5; i++){
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        // Close the scanner
        scanner.close();
        // Find the second-largest element
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }
        // Check if there's a second-largest element
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second-largest element. All elements are the same.");
        }else {
            System.out.println("The second-largest element is " + secondLargest + ".");
        }
    }
}










//import java.util.Scanner;
//
//public class Q4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] numInputs = new int[5];
//
//        for(int i=0; i<5; i++){
//            System.out.print("Enter the element " + i + " of the integer array: ");
//            numInputs[i] = input.nextInt();
//        }
//
//        int largest = numInputs[0];
//        int sec_largest = numInputs[0];
//
//        for(int j=0; j<5; j++){
//            if(numInputs[j] > largest) {
//                sec_largest = largest;
//                largest = numInputs[j];
//            } else if (numInputs[j] > sec_largest && numInputs[j] < largest) {
//                sec_largest = numInputs[j];
//            }
//        }
//        if(largest == sec_largest){
//            System.out.println("All elements are same, and it is " + largest + " .");
//        }else {
//            System.out.println("The second largest element in the array: " + sec_largest);
//        }
//    }
//}







