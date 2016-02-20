package HoldingObjects;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14
{
	private LinkedList<Integer> list = new LinkedList<Integer>();

	public void ite(int i)
	{
		ListIterator<Integer> it = list.listIterator(list.size() / 2);

		if (!it.hasNext())
			it.add(i);
		else
			it.add(i);

		System.out.println(list);
	}

	public void ite(int[] ints)
	{
		for (int i : ints)
		{
			ListIterator<Integer> it = list.listIterator(list.size() / 2);
			it.add(i);
			System.out.println(list);
		}
	}

	public static void main(String[] Args)
	{
		Ex14 e = new Ex14();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		e.ite(arr);

	}
}
