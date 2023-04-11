package Exception;
import java.util.*;
import java.util.Scanner;

public class NullPointerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            // Attempt to convert input to an integer
            int number = Integer.parseInt(input); // This line can throw a NullPointerException
            System.out.println("Number: " + number);
        }
        catch(NullPointerException e) {
            System.out.println("Caught error" + e);
        }
    }
} 
