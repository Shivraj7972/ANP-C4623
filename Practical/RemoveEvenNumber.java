package Arrays;

public class RemoveEvenNumber 
{
	public static void main(String[] args) 
	{
		int[] num = {5,6,8,2,4,9,7,98,45};
		
		int[] oddnum = new int[num.length];
        int oddIndex = 0;
        for (int i = 0; i < num.length; i++) 
        {
            if (num[i] % 2 != 0) 
            {
                oddnum[oddIndex] = num[i];
                oddIndex++;
            }
        }
        System.out.println("Array after removing even numbers:");
        for (int i = 0; i < oddIndex; i++) 
        {
            System.out.print(oddnum[i] + " ");
        }
	}

}
