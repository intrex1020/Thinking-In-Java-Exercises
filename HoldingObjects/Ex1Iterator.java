package HoldingObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ex1Iterator
{
	private int gebrilNumber;

	public Ex1Iterator(int i)
	{
		gebrilNumber = i;
	}

	public int hop()
	{
		return gebrilNumber;
	}

	public static void display(Iterator<Ex1Iterator> ite)
	{
		while (ite.hasNext())
		{
			Ex1Iterator e = ite.next();
			System.out.println(e);
		}
	}

	@Override
	public String toString()
	{
		return "" + gebrilNumber;
	}

	public static void main(String[] Args)
	{
		Collection<Ex1Iterator> list = new ArrayList<Ex1Iterator>();
		Collection<Integer> list1 = new ArrayList<Integer>();

		Collections.addAll(list1, 5, 6, 6);
		System.out.println(list1);

		for (int i = 0; i < 3; i++)
			list.add(new Ex1Iterator(i));

		Ex1Iterator.display(list.iterator());
	}
}
