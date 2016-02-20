package HoldingObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomRodentGenerator
{
	private Random rand = new Random();

	public Rodent next()
	{
		switch (rand.nextInt(3))
		{
			default:
			case 0:
				return new Mouse();
			case 1:
				return new Rat();
			case 2:
				return new Squirrel();
		}
	}

	public static void display(Iterator<Rodent> it)
	{
		while (it.hasNext())
		{
			Rodent r = it.next();
			System.out.print(r + " ");
		}
	}

	public static void main(String[] args)
	{
		List<Rodent> list = new ArrayList<Rodent>();
		RandomRodentGenerator gen = new RandomRodentGenerator();

		for (int i = 0; i <= 10; i++)
			list.add(gen.next());

		RandomRodentGenerator.display(list.iterator());
	}
}

class Rodent
{
	private String name = "Rodent";

	protected void eat()
	{
		System.out.println("Rodent.eat()");
	}

	protected void run()
	{
		System.out.println("Rodent.run()");
	}

	protected void sleep()
	{
		System.out.println("Rodent.sleep()");
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Mouse extends Rodent
{
	private String name = "Mouse";

	@Override
	protected void eat()
	{
		System.out.println("Mouse.eat()");
	}

	@Override
	protected void run()
	{
		System.out.println("Mouse.run()");
	}

	@Override
	protected void sleep()
	{
		System.out.println("Mouse.sleep()");
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Rat extends Rodent
{
	private String name = "Rat";

	@Override
	protected void eat()
	{
		System.out.println("Rat.eat()");
	}

	@Override
	protected void run()
	{
		System.out.println("Rat.run()");
	}

	@Override
	protected void sleep()
	{
		System.out.println("Rat.sleep()");
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Squirrel extends Rodent
{
	private String name = "Squirrel";

	@Override
	protected void eat()
	{
		System.out.println("Squirrel.eat()");
	}

	@Override
	protected void run()
	{
		System.out.println("Squirrel.run()");
	}

	@Override
	protected void sleep()
	{
		System.out.println("Squirrel.sleep()");
	}

	@Override
	public String toString()
	{
		return name;
	}
}