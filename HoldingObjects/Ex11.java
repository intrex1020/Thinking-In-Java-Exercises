package HoldingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex11
{
	public static void display(Collection c)
	{
		Iterator it = c.iterator();

		while (it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println("");
	}

	public static void main(String[] Args)
	{
		Collection<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		Collection<Character> ll = new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
		Collection<Float> hs = new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
		Collection<Double> ts = new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
		Collection<Integer> lhs = new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));

		Ex11.display(al);
		Ex11.display(ll);
		Ex11.display(hs);
		Ex11.display(ts);
		Ex11.display(lhs);
	}
}
