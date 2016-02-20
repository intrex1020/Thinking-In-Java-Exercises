package generics;

import java.util.Iterator;
import java.util.Random;
import net.mindview.util.Generator;

public class StoryCharacter
{
	@Override
	public String toString()
	{
		return getClass().getSimpleName();
	}

	public static void main(String[] Args)
	{
		StoryCharacterGenerator gen = new StoryCharacterGenerator();

		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for (StoryCharacter sc : new StoryCharacterGenerator(5))
			System.out.println(sc);
	}
}

class StoryCharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter>
{
	private Class[] types = {Pluto.class, Mandy.class, Donald.class, Deadpool.class};
	private static Random rand = new Random();
	private int size = 0;

	public StoryCharacterGenerator()
	{
	}

	public StoryCharacterGenerator(int size)
	{
		this.size = size;
	}

	@Override
	public StoryCharacter next()
	{
		try
		{
			return (StoryCharacter) types[StoryCharacterGenerator.rand.nextInt(types.length)].newInstance();
		}
		catch (Exception e)
		{
			throw new RuntimeException();
		}
	}

	@Override
	public Iterator<StoryCharacter> iterator()
	{
		return new Iterator<StoryCharacter>()
		{
			int count = size;

			@Override
			public boolean hasNext()
			{
				return count > 0;
			}

			@Override
			public StoryCharacter next()
			{
				count--;
				return StoryCharacterGenerator.this.next();
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException();
			}
		};
	}
}

abstract class BadGuys extends StoryCharacter
{

}

abstract class GoodGuys extends StoryCharacter
{

}

class Pluto extends GoodGuys
{

}

class Donald extends GoodGuys
{

}

class Mandy extends BadGuys
{

}

class Deadpool extends BadGuys
{

}
