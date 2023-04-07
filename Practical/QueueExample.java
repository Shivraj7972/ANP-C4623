package Collection;
import java.util.*;
public class QueueExample 
{
	public static void main(String[] args)
	{
		Queue<Integer> q=new LinkedList<>();
		//add elements
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}
		//display the elements of the queue
		System.out.println("Elements of queue:" +q);
		
		//to remove the head of queue
		System.out.println("Removed Element is:" +q.remove());
		System.out.println("Elements of queue:" +q); //after removal
		
		//to view the head element of queue
		System.out.println("Head of queue:" +q.peek());  //peek: it will show the the head of queue
		
		//size of queue
		System.out.println("Size of queue:" +q.size());
		
	}

}