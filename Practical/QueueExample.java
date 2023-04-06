package Collection;
import java.util.*;

public class QueueExample
{

    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<Integer>();
        
        // Add elements to the linked list
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        Iterator itr = q.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}