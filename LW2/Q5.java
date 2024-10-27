import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(sentence, " ,.?!");

        String sentence2 = "";
        while (st.hasMoreTokens())
            sentence2 = sentence2 + st.nextToken();

        String sentence3 = sentence2.toLowerCase();
        System.out.println(sentence3);

        String reversedStr = "";
        for (int i = (sentence3.length() - 1); i >= 0; i--) {
            reversedStr = reversedStr + sentence3.charAt(i);
        }
        System.out.println(reversedStr);

        if (sentence3.equals(reversedStr)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not palindrome!");
        }
    }
}
//  "A man, a plan, a canal, Panama!"








//import java.util.StringTokenizer;
//
//public class Q5 {
//    public static void main(String[] args) {
//        // Get the sentence from the user
//        System.out.print("Enter a sentence: ");
//        String input = System.console().readLine();
//
//        // Remove spaces and punctuation, and convert to lowercase
//        String cleanInput = input.replaceAll("[^a-zA-Z]","").toLowerCase();
//
//        // Use StringTokenizer to split the cleaned sentence into words
//        StringTokenizer tokenizer = new StringTokenizer(cleanInput);
//
//        // Reconstruct the cleaned sentence without spaces
//        StringBuilder reversed = new StringBuilder();
//        while (tokenizer.hasMoreTokens()) {
//            reversed.insert(0, tokenizer.nextToken());
//        }
//
//        // Check if the cleaned sentence is a palindrome
//        if (cleanInput.equals(reversed.toString())) {
//            System.out.println("The sentence is a palindrome.");
//        }else{
//            System.out.println("The is not a palindrome.");
//        }
//    }
//}


