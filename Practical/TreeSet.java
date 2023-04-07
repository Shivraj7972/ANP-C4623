package Collection;

import java.util.HashSet;
import java.util.Set;

public class TreeSet 
{
	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();	
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
		//printing the elements
		System.out.println("Elements are:" +s);

	}

}
