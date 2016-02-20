package HoldingObjects;

import java.util.Collection;
import java.util.Iterator;
import Pets.Pet;
import Pets.Pets;

public class CollectionSequence implements Collection<Pet>
{
	private Pet[] pets = Pets.createArray(8);

	@Override
	public int size()
	{
		return pets.length;
	}

	@Override
	public Iterator<Pet> iterator()
	{
		return new Iterator<Pet>()
		{
			private int index = 0;

			@Override
			public boolean hasNext()
			{
				return index < pets.length;
			}

			@Override
			public Pet next()
			{
				return pets[index++];
			}

			@Override
			public void remove()
			{
				throw new UnsupportedOperationException();
			}
		};
	}

	// Collections methods

	@Override
	public void clear()
	{
		if (size() != 0)
			for (Pet p : pets)
				p = null;
	}

	@Override
	public boolean addAll(Collection<? extends Pet> p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(Pet p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean contains(Object p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isEmpty()
	{
		return size() == 0 ? true : false;
	}

	@Override
	public boolean remove(Object p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> p)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray()
	{
		return pets;
	}

	@Override
	public <T> T[] toArray(T[] p)
	{
		throw new UnsupportedOperationException();
	}

	public static void display(Iterator<Pet> it)
	{
		while (it.hasNext())
		{
			Pet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
	}

	public static void main(String[] Args)
	{
		CollectionSequence c = new CollectionSequence();
		CollectionSequence.display(c.iterator());
	}
}
