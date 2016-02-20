package generics;

import java.util.Iterator;
import net.mindview.util.Generator;

public class Fibonacci implements Generator<Integer>, Iterable<Integer>
{
	private int count = 0;
	private int last = 0;

	public Fibonacci(){}
	
	public Fibonacci(int i)
	{
		last = i;
	}

	@Override
	public Integer next()
	{
		return fib(count++);
	}

	private int fib(int n)
	{
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	@Override
	public Iterator<Integer> iterator()
	{
		return new Iterator<Integer>()
		{
			@Override
			public boolean hasNext()
			{
				return count < last;
			}

			@Override
			public Integer next()
			{
				return Fibonacci.this.next();
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args)
	{

		for (int i : new Fibonacci(18))
			System.out.print(i + " ");
	}
} /*
	 * Output: 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
	 */// :~
