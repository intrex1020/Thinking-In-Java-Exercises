package HoldingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12
{
	public static void main(String[] Args)
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> l2 = new ArrayList<Integer>();
		ListIterator<Integer> it = l1.listIterator(10);

		while (it.hasPrevious())
			l2.add(it.previous());

		System.out.println(l1);
		System.out.print(l2);
	}
}
