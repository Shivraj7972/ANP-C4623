package Collection;
import java.util.*;
public class PriorityQueueDemo
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		//adding elements 
		pq.add(65);
		pq.add(49);
		pq.add(27);
		pq.add(56);
		
		System.out.println("Total Elements are:" + pq);
		
		//printing the top element 
		System.out.println("Top Element is:" + pq.peek());
		
		//Removing the top element 
		System.out.println("Removed Element is:" + pq.poll()); //by using poll it will remove top element

		System.out.println("Total Elements are:" + pq);
	}

}