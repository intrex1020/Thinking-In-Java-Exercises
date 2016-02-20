package HoldingObjects;

import java.util.ArrayList;
import java.util.List;

interface Selector
{
	boolean end();

	Object current();

	void next();

	SequenceNew seqRef();
}

class Stringi
{
	private String s = "Kot";

	@Override
	public String toString()
	{
		return s;
	}
}

public class SequenceNew
{
	private List<Object> items = new ArrayList<Object>();

	public void add(Object x)
	{
		items.add(x);
	}

	private class SequenceNewSelector implements Selector
	{
		private int i = 0;

		@Override
		public boolean end()
		{
			return i == items.size();
		}

		@Override
		public Object current()
		{
			return items.get(i);
		}

		@Override
		public void next()
		{
			if (i < items.size())
				i++;
		}

		@Override
		public SequenceNew seqRef()
		{
			return SequenceNew.this;
		}
	}

	public Selector selector()
	{
		return new SequenceNewSelector();
	}

	public static void main(String[] args)
	{
		SequenceNew SequenceNew = new SequenceNew();

		for (int i = 0; i < 10; i++)
			SequenceNew.add(Integer.toString(i));
		for (int i = 0; i < 3; i++)
			SequenceNew.add(new Stringi());

		Selector selector = SequenceNew.selector();

		while (!selector.end())
		{
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
