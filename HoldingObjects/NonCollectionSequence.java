package HoldingObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import Pets.Pet;
import Pets.Pets;

class PetSequence
{
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence
{
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

	public Iterable<Pet> reversed()
	{
		return new Iterable<Pet>()
		{
			@Override
			public Iterator<Pet> iterator()
			{
				return new Iterator<Pet>()
				{
					private int index = pets.length - 1;

					@Override
					public boolean hasNext()
					{
						return index > -1;
					}

					@Override
					public Pet next()
					{
						return pets[index--];
					}

					@Override
					public void remove()
					{
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<Pet> randomize()
	{
		return new Iterable<Pet>()
		{
			@Override
			public Iterator<Pet> iterator()
			{
				List<Pet> l1 = new LinkedList<Pet>(Arrays.asList(pets));
				Collections.shuffle(l1);
				return l1.listIterator();
			}
		};
	}

	public static void main(String[] args)
	{
		NonCollectionSequence nc = new NonCollectionSequence();
		CollectionSequence.display(nc.iterator());
		CollectionSequence.display(nc.reversed().iterator());
		CollectionSequence.display(nc.randomize().iterator());

		for (Pet p : nc.reversed())
			System.out.print(p.id() + " " + p);
		System.out.println();
		for (Pet p : nc.randomize())
			System.out.print(p.id() + " " + p);
	}
} /*
	 * Output: 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
	 */// :~
