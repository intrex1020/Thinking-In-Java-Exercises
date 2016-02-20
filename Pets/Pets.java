//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package Pets;

import java.util.ArrayList;

public class Pets
{
	public static final PetCreator creator = new LiteralPetCreator();

	public static Pet randomPet()
	{
		return Pets.creator.randomPet();
	}

	public static Pet[] createArray(int size)
	{
		return Pets.creator.createArray(size);
	}

	public static ArrayList<Pet> arrayList(int size)
	{
		return Pets.creator.arrayList(size);
	}
} /// :~
