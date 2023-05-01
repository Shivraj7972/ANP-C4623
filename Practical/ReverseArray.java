package Arrays;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        int[] num = {2, 5, 8, 11, 6, 13, 9, 10};
        
        //Create a array to store the reversed elements
        int[] reversed = new int[num.length];
        
        //Copy the elements of the original array into the reversed array in reverse order
        for (int i = num.length - 1; i >= 0; i--) 
        {
            reversed[num.length - 1 - i] = num[i];
        }
        
        //Print out the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < reversed.length; i++) 
        {
            System.out.print(reversed[i] + " ");
        }
    }
}
