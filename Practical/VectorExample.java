package Collection;

import java.util.*;

public class VectorExample 
{

    public static void main(String[] args) 
    {
        Vector<String> vector = new Vector<String>();
        
        // Add elements to the vector
        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        
        // Display the contents of the vector
        System.out.println("Contents of the vector:");
        Iterator itr = vector.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
