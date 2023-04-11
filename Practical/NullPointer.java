package Exception;

import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // check if the string is empty
        if (str.isEmpty()) {
            System.out.println("The string is empty. Please enter a non-empty string.");
        } 
        else 
        {
            try {
                // call the length() method on the string
                int length = str.length();
                System.out.println("The length of the string is: " + length);
            } catch (NullPointerException e) {
                System.out.println("The string is null. Please enter a non-null string.");
                System.out.println("Error message: " + e.getMessage());
            }
        }

        input.close();
    }
}
