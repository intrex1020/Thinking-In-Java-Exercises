package HoldingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

interface Selector1
{
	boolean end();

	Object current();

	void next();

	SequenceIterator seqRef();
}

class Stringi1
{
	private String s = "Kot";

	@Override
	public String toString()
	{
		return s;
	}
}

public class SequenceIterator
{
	private List<Object> items = new ArrayList<Object>();

	public void add(Object x)
	{
		items.add(x);
	}

	public List<Object> getItems()
	{
		return Collections.unmodifiableList(items);
	}

	public static void display(Iterator<Object> it)
	{
		while (it.hasNext())
		{
			Object o = it.next();
			System.out.print(o + " ");
		}
	}

	public static void main(String[] args)
	{
		SequenceIterator SequenceIterator = new SequenceIterator();

		for (int i = 0; i < 10; i++)
			SequenceIterator.add(Integer.toString(i));
		for (int i = 0; i < 3; i++)
			SequenceIterator.add(new Stringi1());

		HoldingObjects.SequenceIterator.display(SequenceIterator.getItems().iterator());
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
