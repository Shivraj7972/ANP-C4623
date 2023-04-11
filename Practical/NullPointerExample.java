package Exception;

import java.util.Scanner;

public class NullPointerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine(); // Read user input

        // Check for null or empty input
        if (userInput == null) {
            System.out.println("Input is null.");
        } else if (userInput.isEmpty()) {
            System.out.println("Input is empty.");
        } else {
            int length = userInput.length();
            System.out.println("Length of the string: " + length);
        }
    }
}
