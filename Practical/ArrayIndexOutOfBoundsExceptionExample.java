package Exception;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) 
        {
            numbers[i] = input.nextInt();
        }
        try 
        {
            System.out.println("Enter an index (0 to 4):");
            int index = input.nextInt();
            System.out.println("Value at index " + index + " is " + numbers[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Invalid index");
        }

        input.close();
    }
}
