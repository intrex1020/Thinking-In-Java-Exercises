package Exercises.Eckel;

interface Selector
{
	boolean end();

	Object current();

	void next();

	Sequence seqRef();
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

public class Sequence
{
	private Object[] items;
	private int next = 0;

	public Sequence(int size)
	{
		items = new Object[size];
	}

	public void add(Object x)
	{
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector
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
		public Sequence seqRef()
		{
			return Sequence.this;
		}
	}

	public Selector selector()
	{
		return new SequenceSelector();
	}

	public static void main(String[] args)
	{
		Sequence sequence = new Sequence(10);
		Sequence sequence2 = new Sequence(3);
		sequence2.selector().seqRef();

		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		for (int i = 0; i < 3; i++)
			sequence2.add(new Stringi());

		Selector selector = sequence.selector();
		Selector selector2 = sequence2.selector();

		while (!selector.end())
		{
			System.out.print(selector.current() + " ");
			selector.next();
		}
		while (!selector2.end())
		{
			System.out.print(selector2.current() + " ");
			selector2.next();
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
