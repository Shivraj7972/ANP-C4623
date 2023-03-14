package Arrays;

import java.util.Scanner;

public class Multi_D_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create the 2-dimensional array
        int[][] arr = new int[rows][columns];

        // Ask the user to enter each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // Calculate the sum of each row and column
        int[] rowSum = new int[rows];
        int[] colSum = new int[columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
            }
        }

        // Display the sum of each row
        System.out.println("The sum of each row is:");
        for (int i = 0; i < rows; i++) {
            System.out.print(rowSum[i] + " ");
        }

        // Display the sum of each column
        System.out.println("\nThe sum of each column is:");
        for (int j = 0; j < columns; j++) {
            System.out.print(colSum[j] + " ");
        }
    }
}
