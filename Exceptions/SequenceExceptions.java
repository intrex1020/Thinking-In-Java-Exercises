package Exceptions;

interface Selector
{
	boolean end();

	Object current();

	void next();

	SequenceExceptions seqRef();
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

public class SequenceExceptions
{
	private Object[] items;

	public SequenceExceptions(int i)
	{
		items = new Object[i];
	}

	public void add(Object x, int i)
	{
		if (i >= items.length)
			throw new ArrayIndexOutOfBoundsException();
		items[i] = x;
	}

	private class SequenceExceptionsSelector implements Selector
	{
		private int i = 0;

		@Override
		public boolean end()
		{
			return i == items.length;
		}

		@Override
		public Object current()
		{
			return items[i];
		}

		@Override
		public void next()
		{
			if (i < items.length)
				i++;
		}

		@Override
		public SequenceExceptions seqRef()
		{
			return SequenceExceptions.this;
		}
	}

	public Selector selector()
	{
		return new SequenceExceptionsSelector();
	}

	public static void main(String[] args)
	{
		SequenceExceptions SequenceNew = new SequenceExceptions(5);

		for (int i = 0; i < 10; i++)
			SequenceNew.add(Integer.toString(i), i);
		for (int i = 0; i < 3; i++)
			SequenceNew.add(new Stringi(), i);

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
