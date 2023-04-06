package Collection;
import java.util.*;

public class LinkedListExample
{

    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        // Add elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}