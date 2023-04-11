package Exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of th1e array
        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        
        // Declare and initialize an array with the given size
        int[] numbers = new int[s];
        
        // Prompt the user to enter the elements of the array
        for (int i = 0; i < s; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Try to access an element outside the bounds of the array
        try {
            int value = numbers[s]; // This will throw an ArrayIndexOutOfBoundsException
            System.out.println("The value is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! Something went wrong.");
            System.out.println("The index is out of bounds.");
            System.out.println("Please enter a valid index between 0 and " + (numbers.length - 1) + ".");
            System.out.println("Error message: " + e.getMessage());
        }
        
        sc.close();
    }
}
